//single threading by using thread class
package treading;

public class Threading extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(getName());
            try {
                sleep(1000);
                if (i==5){
                    stop();
                }

            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }

    public static void main(String[] args) {
        Threading ob= new Threading();
        ob.setName("China");
        ob.start();
    }
}