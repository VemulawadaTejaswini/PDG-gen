import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long c = sc.nextLong();
        long k = sc.nextLong();

        long[] t = new long[n];
        for(int i=0; i<n; i++) {
            t[i] = sc.nextLong();
        }

        Arrays.sort(t);
        int bus = 0;
        for(int i=0; i<n;) {
            int start = i;
            while(i < n && t[i] - t[start] <= k && i - start < c) i++;
            bus++;
        }
        System.out.println(bus);
    }
}
