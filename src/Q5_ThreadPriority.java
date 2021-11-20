class MaxP extends Thread{
    public void run(){
        System.out.println("I am max priority thread.");
    }
}
class NormP extends Thread{
    public void run(){
        System.out.println("I am norm priority thread.");
    }
}
class MinP extends Thread{
    public void run(){
        System.out.println("I am min priority thread.");
    }
}
public class Q5_ThreadPriority extends Thread{
    public static void main(String[] args) {
        MaxP maxp = new MaxP();
        NormP normp = new NormP();
        MinP minp = new MinP();
        minp.setPriority(Thread.MIN_PRIORITY);
        normp.setPriority(Thread.NORM_PRIORITY);
        maxp.setPriority(Thread.MAX_PRIORITY);
        normp.start();
        minp.start();
        maxp.start();
    }
}
