import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] a = new int[N];
        int sum = 0;
        for(int i=0; i<N; i++) {
            a[i] = Integer.parseInt(sc.next());
            sum += a[i];
        }
        double av = (double)sum / (double)N;
        long v = Math.round(av);
        
        long ans = 0;
        for(int i=0; i<N; i++) {
            ans += Math.pow(a[i]-v, 2);
        }
        System.out.println(ans);
    }
}
