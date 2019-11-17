package treading;

public class MultiThreading1 extends Thread {
        public void run(){
            try{
            for(int i=1;i<=10;i++)
            {
                System.out.println(i+" --------Achyut");
                sleep(1000);
            }
            }
                catch(Exception e) {
                    System.out.println(e);
                }
        }
        }
        class Multi2 extends Thread{
            public void run(){
                try {
                    for (int j = 10; j >= 1; j--) {
                        System.out.println(j + " --------Kumar Tiwari");
                        sleep(500);
                    }
                }
                    catch(Exception ee){
                        System.out.println(ee);
                    }
                }
            }

class Multi{
    public static void main(String[] args) {
        MultiThreading1 th=new MultiThreading1();
        Multi2 t=new Multi2();
        th.start();
        t.start();
    }
}