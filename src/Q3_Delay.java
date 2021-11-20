public class Q3_Delay extends Thread{

    public static void main(String[] args) throws InterruptedException {
        for(int i=1;i<=10;i++){
            if(i==5){
                System.out.println(i);
                Thread.sleep(5000);
            }
            else{
                System.out.println(i);
            }
        }
    }
}
