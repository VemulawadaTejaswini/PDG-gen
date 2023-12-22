import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        String s = sc.next();
        int min = 999;
        for (int i = 0; i < s.length() - 2; i++) {
            min = Math.min(min, Math.abs(753 - Integer.valueOf(s.substring(i, i + 3))));
        }
        System.out.println(min);
    }
}