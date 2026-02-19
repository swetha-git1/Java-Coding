class ThreadClass extends Thread{

    @Override
    public void run(){
        System.out.println("My thread class is running..");
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Runnable interface is running");
    }
}
public class MyThread{
     public static void main(String[] args){
         ThreadClass t1 = new ThreadClass();
         t1.start();
         System.out.println("Main thread is running");
         MyRunnable r1 = new MyRunnable();
         Thread t2 = new Thread(r1);
         t2.start();
         Runnable r = () -> {System.out.println("Running thread using lambda");};
         Thread t = new Thread(r);
         t.start();
     }
}
