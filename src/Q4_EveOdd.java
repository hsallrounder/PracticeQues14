public class Q4_EveOdd extends Thread{

    public static void main(String[] args){
        Thread odd = new Thread(()-> {
            for(int i=1;i<=20;i++){
                if(i%2!=0){
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
            }
        });

        Thread eve = new Thread(()->{
            try {
                odd.join();
            } catch (InterruptedException e) {
            }
            for(int i=1;i<=20;i++){
                if(i%2==0){
                    System.out.println(i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                    }
                }
            }
        });
        odd.start();
        eve.start();
    }
}
