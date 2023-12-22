import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = sc.nextInt();
        sc.nextLine();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        long res = solve(a,n);
        System.out.println(res);
    }

    private static long solve(int[] a, int n) {
        long sum = 0L;
        for (int i = 0; i < n; i++) {
            sum+=(long)a[i];
        }
        long partial = 0L;
        long half = sum/2;
        long min = Long.MAX_VALUE;
        long closest = 0L;
        for (int i = 0; i < n; i++) {
            partial += (long)a[i];
            if (Math.abs(partial - half) < min) {
                min = Math.abs(partial - half);
                closest = partial;
            }
        }
        return Math.abs(half - closest) + (sum%2) ;
    }
}
