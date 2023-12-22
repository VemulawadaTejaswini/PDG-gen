import java.util.Scanner;

public class Main implements Runnable {

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), C = sc.nextInt();
        int[] s = new int[100000], t = new int[100000];
        for (int i = 0; i < N; i++) {
            s[i] = sc.nextInt();
            t[i] = sc.nextInt();
            sc.nextLine();
        }

        int[] count = new int[200002];
        for (int j = 0; j < N; j++) {
            for (int k = s[j] * 2 - 1; k < t[j] * 2; k++) {
                count[k]++;
            }
        }

        int max = 0;
        for (int i = 0; i < 200002; i++) {
            max = Math.max(max, count[i]);
        }
        System.out.println(max);
    }
}