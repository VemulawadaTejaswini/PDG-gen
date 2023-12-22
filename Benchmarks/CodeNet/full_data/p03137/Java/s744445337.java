import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if (n >= m) {
            System.out.println(0);
            return;
        }
        int[] x = new int[m];
        for (int i = 0; i < m; i++) {
            x[i] = sc.nextInt();
        }

        int[] d1 = new int[m-1];
        int sum = 0;
        for (int i = 0; i < m-1; i++) {
            d1[i] = x[i+1] - x[i];
            sum += d1[i];
        }
        Arrays.sort(d1);
        for (int i = 0; i < n-1; i++) {
            sum -= d1[m-i-2];
        }

        System.out.println(sum);
    }
}
