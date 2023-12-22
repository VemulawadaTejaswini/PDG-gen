import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long sum = 0;
        for(int i=0; i<n; i++) {
            a[i] = sc.nextLong()-i+n;
            sum+=a[i];
        }
        Arrays.sort(a);
        System.out.println(calc(n, a, a[n/2]));
    }

    static long calc (long n, long[]a, long d) {
        long sum = 0;
        for(int i=0; i<n; i++) {
            sum += Math.abs(a[i] - d);
        }
        return sum;
    }

}
