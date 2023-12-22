import java.util.*;

public class Main{
    public static void main(String[] argc){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] a = new int[N];
        for(int i=0;i<N;i++){
            a[i] = Math.abs(X - sc.nextInt());
        }
        if(N == 1){
            System.out.println(a[0]);
            return;
        }

        int ans = gcd(a[0], a[1]);
        for(int i=2;i<N;i++){
            ans = gcd(ans, a[i]);
        }

        System.out.println(ans);
    }

    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
}