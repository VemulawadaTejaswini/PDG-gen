import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int n = sc.nextInt();
        int nn = n;
        int count = 0;
        for (int i = 5; i > 0; i--) {
            boolean flag = false;
            if (Math.pow(9, i) < nn) {
                nn -= Math.pow(9, i);
                count++;
                flag = true;
            }
            if (Math.pow(6, i) < nn) {
                nn -= Math.pow(6, i);
                count++;
                flag = true;
            }
            if (flag) {
                i++;
            }
        }
        System.out.println(count + nn);
    }
}
