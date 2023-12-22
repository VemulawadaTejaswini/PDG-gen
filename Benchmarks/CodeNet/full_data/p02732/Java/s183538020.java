import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        long[] c = new long[n];
        long total = 0;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt()-1;
            b[a[i]]++;
        }
        for(int i = 0; i < n; i++){
            if(b[i] == 0) continue;
            c[i] = b[i] * (b[i]-1) / 2;
            total += c[i];
        };
        for(int i = 0; i < n; i++){
            System.out.println(total - c[a[i]] + (b[a[i]]-1)*(b[a[i]]-2)/2);
        }
    }
}