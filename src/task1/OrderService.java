package task1;

public class OrderService {
    private int orderCount=0;
    private Object object=new Object();
    public void increaseOrderCount(){
        synchronized (object) {
            this.orderCount += 1;
        }
    }

    public int getOrderCount() {
        return orderCount;
    }
}
