import java.util.Scanner;
public class Main {
public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long x = sc.nextLong();

        long a[] = new long[n];
        long b[] = new long[n];
        long min =x;

        for(int i=0;i<n;i++) {
        	a[i] = sc.nextLong();
        	min = Math.min(min,a[i]);
        }
        long y = x -min;
        long z = a[0] - min;
        for(int i=0;i<n;i++) {
        	b[i] = a[i] -min;
        	z = gcd(z,b[i]);
        }
        z = gcd(z,y);

        System.out.println(z);

    }

    private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
}