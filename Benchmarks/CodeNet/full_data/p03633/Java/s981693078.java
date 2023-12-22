import java.util.*;
import java.util.Arrays;
import java.util.Set;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        long[]T=new long[N];
        for(int i=0;i<N;i++){
            T[i]=sc.nextLong();
        }
        long a=lcm(T[0],T[1]);
        for(int i=2;i<N;i++){
            a=lcm(a,T[i]);
        }
        System.out.println(a);




        }
        public static long lcm(long m,long n){
            return m*n/gcd(m,n);
        }
        public static long gcd(long m,long n){
            if(m<n){
                return gcd(n,m);
            }
            if(n==0){
                return m;
            }
            return gcd(n,m%n);

        }
        
        
    }
