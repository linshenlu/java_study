package thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CompletableFutureDemo {

    CompletableFuture f1 = CompletableFuture.runAsync(()->{
        System.out.println("T1:洗⽔壶...");
        sleep(1, TimeUnit.SECONDS);
        System.out.println("T1:烧开⽔...");
        sleep(15, TimeUnit.SECONDS);
    });

    CompletableFuture f2 = CompletableFuture.supplyAsync(()->{
        System.out.println("T2:洗茶壶...");
        sleep(1, TimeUnit.SECONDS);
        System.out.println("T2:洗茶杯...");
        sleep(2, TimeUnit.SECONDS);
        System.out.println("T2:拿茶叶...");
        sleep(1, TimeUnit.SECONDS);
        return "⻰井";
    });

/*    CompletableFuture<String> f3 = f1.thenCombine(f2, ()->{

        *//*String tf = f2.get();
        System.out.println("T1:拿到茶叶:" + tf);
        System.out.println("T1:泡茶...");
        return "上茶:" + tf;*//*
    });*/

    void sleep(int t, TimeUnit u){
        try {
            u.sleep(t);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
