import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static long gcd(long m,long n){
        if(m<n)return gcd(n,m);
        if(n==0)return m;
        return gcd(n,m%n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long T[]=new long[N];
        for(int i=0;i<N;i++){
            T[i]=sc.nextLong();
        }
        long a=T[0];
        for(int i=1;i<N;i++){
            a=(a*T[i])/gcd(a,T[i]);
        }
        System.out.println(a);
    }
}