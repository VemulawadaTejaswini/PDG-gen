import java.util.*;
 
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 

        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] x = new int[N+1];
        for(int i = 0; i < N; i++){
            x[i] = sc.nextInt();
        }
        sc.close();
        x[N] = X;
        Arrays.sort(x);
        int[] dis_X = new int[N];
        for(int i = 0; i < N; i++){
            dis_X[i] = Math.abs(x[i+1] - x[i]);
        }
        int[] gcd = new int[N];
        gcd[0] = dis_X[0];
        for(int i = 1; i < N; i++){
            gcd[i] = gcd(dis_X[i], gcd[i-1]);
        }

        System.out.println(gcd[N-1]);
        
    }
    static int gcd(int m, int n){
        if(n == 0)
            return m;
        if(n > m)
            return gcd(n, m);
        else
            return gcd(n, m%n);
    }
}