import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if(max < a[i]) max = a[i];
        }
        boolean ans = false;
        if(k <= max){
            int gcd = a[0];
            for (int i = 1; i < n; i++) {
                gcd = gcd(gcd, a[i]);
            }
            for (int i = 0; i < n; i++) {
                if(k <= a[i] && (a[i] - k) % gcd == 0){
                    ans = true;
                    break;
                }
            }
        }
        if(ans) System.out.println("POSSIBLE");
        else System.out.println("IMPOSSIBLE");
        sc.close();
    }

    public static int gcd(int a, int b){
        if(a < b) return gcd(b, a);
        if(b == 0) return a;
        return gcd(b, a%b);
    }

}

