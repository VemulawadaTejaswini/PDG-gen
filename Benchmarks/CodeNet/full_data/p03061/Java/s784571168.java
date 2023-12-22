

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N;i ++) arr[i] = sc.nextInt();

        long[] left = new long[N+1];
        long[] right = new long[N+1];
        for(int i = 0; i < N; i++) {
            left[i+1] = gcd(left[i], arr[i]);
        }
        for(int i = N-1; i >= 0; i--) {
            right[i] = gcd(right[i+1], arr[i]);
        }
        long res = 0;
        for(int i = 0; i < N; i++) {
            int l = (int)left[i];
            int r = (int)right[i+1];
            res = Math.max(res, gcd(l,r));
        }
        System.out.println(res);
    }
    public static long gcd(long a, long b) {
        if(b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
