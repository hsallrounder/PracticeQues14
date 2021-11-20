import java.util.Random;

public class Q2_ColourArray implements Runnable{
    String colours[]={"white","blue","black","green","red","yellow"};
    Random rand = new Random();
    @Override
    public void run() {
        while(true){
            int n=rand.nextInt(6);
            if(colours[n]!="red"){
                System.out.println(colours[n]);
            }
            else{
                break;
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Q2_ColourArray());
        t1.start();
    }
}
