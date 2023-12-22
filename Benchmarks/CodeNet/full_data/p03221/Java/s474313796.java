import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int n = sc.nextInt(), m = sc.nextInt();
        int[] pref = new int[m];
        int[] year = new int[m];
        int[][] a = new int[m][4];

        for (int i = 0; i < m; i++) {
            a[i][0] = i;
            a[i][1] = sc.nextInt(); // city
            a[i][2] = sc.nextInt(); // year
        }

        sortYear(a);
        int currentCity = a[0][1];
        int count = 0;
        for (int i = 0; i < m; i++) {
            if (currentCity == a[i][1]) {
                count++;
                a[i][3] = count;
            } else {
                count = 1;
                currentCity = a[i][1];
                a[i][3] = count;
            }
        }
        sortCity(a);

        for (int i = 0; i < m; i++) {
            System.out.println(String.format("%06d", a[i][1]) + String.format("%06d", a[i][3]));
        }
    }

    static void sortCity(int[][] array) {
        Arrays.sort(array, Comparator.comparingInt(a -> a[0]));
    }

    static void sortYear(int[][] array) {
        Arrays.sort(array, (a, b) -> {
            if (a[1] > b[1]) {
                return 1;
            }
            if (a[1] == b[1] && a[2] > b[2]) {
                return 1;
            } else {
                return -1;
            }
        });
    }
}
