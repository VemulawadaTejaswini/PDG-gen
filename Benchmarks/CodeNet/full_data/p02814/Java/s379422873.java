import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {
    public static long gcd(long p,long q){
        if(q==0)
            return p;
        long r=p%q;
        return gcd(q,r);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        int m=sc.nextInt();
        long n=sc.nextLong();
        int a[]=new int[m+1];
        long all=1;
        for(int i=0;i<m;i++) {
            a[i] = sc.nextInt();
            all = all*a[i]/Main.gcd(all, a[i]);
        }
        all=all*a[m-1]/Main.gcd(all, a[m-1]);
        System.out.println((2*n/all+1)/2);

    }
}
