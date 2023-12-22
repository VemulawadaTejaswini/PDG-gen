import java.util.*;

/*
問題文


*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        long n = sc.nextLong();
        long[] a;

        for (int i = 0; i < n; i ++) {
            a[i] = sc.nextInt();
            if (k/2 <= a[i]) {
                a[i] = a[i] - k/2;
            }
        }

        Arrays.sort(a);
        System.out.println(Math.abs(a[0]) + Math.abs(a[(int)n-1]));
    }
}