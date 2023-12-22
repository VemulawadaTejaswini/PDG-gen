import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int mod = (int)1e9+7;

        long ans = 3;

        for (int i=1; i<n; i++){
            int tmp = i-a[i];
            ans *= tmp;
            ans %= mod;
        }
        System.out.println(ans);
    }
}