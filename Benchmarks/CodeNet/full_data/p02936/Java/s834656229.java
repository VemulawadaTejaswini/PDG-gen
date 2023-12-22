import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] t = new int[n];

        for(int i=0; i<n-1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            t[b] = a;
        }

        long[] p = new long[n];
        for(int i=0; i<q; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt();
            p[a] += b;
        }


        for(int i=1; i<n; i++) {
            p[i] += p[t[i]];
        }

        System.out.print(p[0]);
        for(int i=1; i<n ;i++) {
            System.out.print(' ');
            System.out.print(p[i]);
        }
        System.out.println();
    }

}
