import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] d = new int[n];
        for(int i = 0; i < n; i++){
            d[i] = Integer.parseInt(sc.next());
        }
        
        if(d[0] != 0){
            System.out.println(0);
            return;
        }
        
        long[] d2 = new long[n];
        int max = 0;
        for(int i = 0; i < n; i++){
            d2[d[i]]++;
            if(d[i] > max) max = d[i];
        }
        
        if(d2[0] != 1){
            System.out.println(0);
            return;
        }
        
        final int MOD = 998244353;
        long ans = 1;
        for(int i = 2; i <= max; i++){
            if(d2[i-1] == 0 || d2[i] == 0){
                System.out.println(0);
                return;
            }
            ans *= Math.pow(d2[i-1], d2[i]);
            ans %= MOD;
        }
        
        System.out.println(ans);
    }
}