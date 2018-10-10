class RunnableDemo implements Runnable {
 private Thread t;
 private String threadName;

 RunnableDemo( String name) {
 threadName = name;
 System.out.println("Creating " + threadName );
 }

 
}
public class TestThread {
 public static void main(String args[]) {
 RunnableDemo R1 = new RunnableDemo( "Thread-1");
 
 RunnableDemo R2 = new RunnableDemo( "Thread-2");
 
 }
}