import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n  = in.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int ans = 0;
        for(int i = 0; i < n; i++) {
            int[] t = new int[n-i];
            for(int j = 0; j < n-i; j++) {
                t[j] += j == 0 ? a[i+j] : t[j-1] + a[i+j];
                if(t[j] == 0) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}