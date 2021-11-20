public class Q1_Display extends Thread{
    public static void main(String[] args) {
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        t1.setName("Scooby");
        t2.setName("Shaggy");
        System.out.println("Name of the first thread: "+t1.getName());
        System.out.println("Name of the second thread: "+t2.getName());
    }
}
