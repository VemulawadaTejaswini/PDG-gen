import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int T = sc.nextInt();
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }

        int cur = 0;
        long sum = 0;
        for (int i = 0; i < n-1; i++) {
            int next = t[i+1];
            int diff = Math.min(T, next - cur);
            cur = next;
            sum += (long)diff;
        }
        sum += T;
        System.out.println(sum);
    }
}