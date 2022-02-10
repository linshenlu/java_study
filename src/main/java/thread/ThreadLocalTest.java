package thread;

import java.util.HashMap;
import java.util.Map;

/**
 * threadlocal
 */
public class ThreadLocalTest {

    public static ThreadLocal<Object> holder = new ThreadLocal<>();
    public static void main(String[] args) {

        holder.set("123123123");
        System.out.println(Thread.currentThread().getName() + holder.get());

        new Thread(()->{
            Map map = new HashMap();
            map.put("name","wen");
            holder.set(map);
            System.out.println(Thread.currentThread().getName() + holder.get());
        }).start();

        System.out.println(Thread.currentThread().getName() + holder.get());
    }

}

