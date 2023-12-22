import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int x[] = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        int dist = 0;
        for (int i = 0; i < n; i++) {
            dist += Math.min(2 * x[i], 2 * Math.abs(x[i] - k));
        }
        System.out.println(dist);
    }
}
