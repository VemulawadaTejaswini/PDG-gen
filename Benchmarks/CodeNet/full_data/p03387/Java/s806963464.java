import java.util.Arrays;
import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int[] n = new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt()};
        Arrays.sort(n);
        int count = 0;
        while (n[0] < n[1]) {
            n[0] += 2;
            count++;
        }
        if (n[0] != n[1]) {
            n[1]++;
            n[2]++;
            count++;
        }
        while (n[1] != n[2]) {
            n[1]++;
            count++;
        }
        System.out.println(count);
    }
}