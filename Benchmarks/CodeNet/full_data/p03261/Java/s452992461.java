import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int n = sc.nextInt();
        String[] list = new String[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.next();
        }
        if (new HashSet<>(Arrays.asList(list)).size() != n) {
            System.out.println("No");
            return;
        }
        for (int i = 1; i < n; i++) {
            if (list[i - 1].charAt(list[i - 1].length()-1) != list[i].charAt(0)) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}