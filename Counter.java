class Counter  implements Runnable{
    private int c = 0;

    public  void incre() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        c++;
    }

    
    
    public void run() {
        synchronized(this){
            this.incre();
            System.out.println("Value for Thread After increment " 
             + Thread.currentThread().getName() + " " + this.getValue());
            
        }        
    }
}

public class RaceConditionDemo{
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new Thread(counter, "Thread-1");
        t1.start();
    }    
}