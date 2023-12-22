import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < n-k+1; i++){
            ans = Math.min(ans, a[i+k-1] - a[i]);
        }
        System.out.println(ans);
    }
}