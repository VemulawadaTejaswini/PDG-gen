import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int n = sc.nextInt();
        int[][] red = new int[n][2];
        int[][] blue = new int[n][2];

        for (int i = 0; i < n; i++) {
            red[i][0] = sc.nextInt();
            red[i][1] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            blue[i][0] = sc.nextInt();
            blue[i][1] = sc.nextInt();
        }

        int count = 0;
        boolean[] r = new boolean[n];
        boolean[] b = new boolean[n];

        Arrays.sort(blue, Comparator.comparingInt(o1 -> o1[0])); // xが小さい順
        Arrays.sort(red, Comparator.comparingInt(o1 -> -o1[1])); // yが大きい順

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!b[i] && !r[j] && blue[i][0] > red[j][0] && blue[i][1] > red[j][1]) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}