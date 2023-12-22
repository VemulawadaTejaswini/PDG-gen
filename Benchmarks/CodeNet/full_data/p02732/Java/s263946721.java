import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            b[i] = x;
            a[x]++;
        }
        long[] s = new long[n+1];
        long sum = 0L;
        for (int i = 0; i < n; i++) {
            if(a[b[i]] < 2 || 0 < s[b[i]])continue;
            long x = (long)a[b[i]]*(a[b[i]]-1L)/2L;
            long y = (long)(a[b[i]]-1L)*(a[b[i]]-2L)/2L;
            sum += x;
            s[b[i]] = x-y;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            long t = sum - s[b[i]];
            sb.append(t + "\n");
        }
        System.out.print(sb.toString());
        sc.close();

    }

}
