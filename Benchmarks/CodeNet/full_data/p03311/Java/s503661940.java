import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long sum = 0;
        for(int i=0; i<n; i++) {
            a[i] = sc.nextLong()-i;
            sum+=a[i];
        }
        long d = sum / n;


        long s1 = 0;
        long s2 = 0;
        long s3 = 0;
        for(int i=0; i<n; i++) {
            s1 += Math.abs(a[i] - d);
            s2 += Math.abs(a[i] - d - 1);
            s3 += Math.abs(a[i] - d + 1);
        }
        System.out.println(Math.min(s1, Math.min(s2, s3)));
    }

}
