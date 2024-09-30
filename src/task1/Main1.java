package task1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main1 {
    public static void main(String[] args) throws InterruptedException {
        OrderService orderService=new OrderService();
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        for (int i = 0; i < 10000; i++) {
            executorService.execute(()->{
                orderService.increaseOrderCount();
            });

        }
        Thread.sleep(1000);
        System.out.println("Natija: "+orderService.getOrderCount());
    }
}
