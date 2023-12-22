import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        int[] M = new int[N];

        for(int i = 0; i < N; i++){
            M[i] = gcd(gcd_l(A, i), gcd_r(A,i+1));
        }

        int max = M[0];
        for(int i = 1; i < N; i++){
            if(M[i] > max)
                max = M[i];
        }
        System.out.println(max);
    }

    static int gcd_l(int[] a, int i){
        if(i == 0)
            return 0;
        else
            return gcd(gcd_l(a, i-1), a[i-1]);
    }

    static int gcd_r(int[] a, int i){
        if(i == a.length)
            return 0;
        else
            return gcd(gcd_r(a, i+1), a[i]);
    }
    static int gcd(int a, int b){
        if(b > a){
           return gcd(b, a);
        }
        if(b == 0)
            return a;
        else
            return gcd(b, a%b);
    }
}
