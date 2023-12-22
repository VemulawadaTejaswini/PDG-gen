import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        String S = sc.next();
        String T = sc.next();
        sc.close();

        long L = (long)(N*M)/gcd(N, M);

        int n = N/gcd(N, M);
        int m = M/gcd(N, M);

        for(int k = 0; k < gcd(N, M); k++){
            if(S.charAt(k*n) == T.charAt(k*m))
                continue;
            else {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(L);
    }

    static int gcd(int n, int m){
        if(n < m)
            return gcd(m, n);
        else{
            if(m == 0)
                return n;
            else
                return gcd(m, n%m);
        }
    }
}