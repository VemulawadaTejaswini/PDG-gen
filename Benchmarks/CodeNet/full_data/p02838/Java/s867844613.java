

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] ins = new long[n];
        for(int i = 0;i < n;i++){
            ins[i] = sc.nextLong();
        }
        long r = 0;
        for(int i = 0;i < n - 1;i++) {
            for (int j = i + 1; j < n; j++) {
                long a = ins[i];
                long b = ins[j];
                r = (r + (a ^ b)) % 1000000007;
            }
        }
        System.out.println(r);
    }
}