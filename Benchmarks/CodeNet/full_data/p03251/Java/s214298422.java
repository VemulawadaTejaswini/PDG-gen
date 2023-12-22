import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), X = sc.nextInt(), Y = sc.nextInt();
        Integer[] x = new Integer[n + 1];
        int[] y = new int[m + 1];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            y[i] = sc.nextInt();
        }
        x[n] = X; y[m] = Y;
        Arrays.sort(x, Collections.reverseOrder());
        Arrays.sort(y);
        if (x[0] < y[0]) System.out.println("No War");
        else System.out.println("War");
    }
}