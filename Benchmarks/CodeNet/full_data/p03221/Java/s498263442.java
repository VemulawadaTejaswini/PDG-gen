import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] a = new int[m][4];

        for (int i = 0; i < m; i++) {
            a[i][0] = i;
            a[i][1] = sc.nextInt(); // city
            a[i][2] = sc.nextInt(); // year
        }

        sortYear(a);
        String[] ans = new String[m];
        int[] count = new int[n + 1];
        for (int i = 0; i < m; i++) {
            count[a[i][1]]++;
            ans[a[i][0]] = String.format("%06d", a[i][1]) + String.format("%06d", count[a[i][1]]);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            sb.append(ans[i]).append("\n");
        }
        System.out.print(sb);
    }

    static void sortYear(int[][] array) {
        Arrays.sort(array, Comparator.comparingInt(a -> a[2]));
    }
}
