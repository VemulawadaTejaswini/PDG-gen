import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input =
            new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(input.readLine());
        array = new int[n];

        StringTokenizer t = new StringTokenizer(input.readLine());
        for (int i=0; i<n; i++) {
            array[i] = Integer.parseInt(t.nextToken());
        }
        //printIntArray(array);
        perm(n);
        System.out.println(sum);
        //System.out.println(tentousuu(a));
    }
    static int[] array;
    static long sum  = 0;

    public static void perm(int n) {
        int a[] = new int[n];
        for (int i=0; i<n; i++) a[i] = i+1;
        perm(a, n-1);
    }

    static void perm(int a[], int pos) {
        if (pos == 0) {
            if (a[pos] <= array[pos]) {
                //printIntArray(a);
                sum += tentousuu(a);
            }
            return;
        }
        for (int i = pos; i >= 0; i--) {
            if (a[i] <= array[pos]) {
                int swap = a[pos];  a[pos] = a[i];  a[i] = swap;
                perm(a, pos - 1);
                swap = a[pos];  a[pos] = a[i];  a[i] = swap;
            }
        }
    }

    static void printIntArray(int b[]) {
        for (int i=0; i<b.length-1; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println(b[b.length-1]);
    }

    static long tentousuu(int []a) {
        long ret = 0;
        for (int i=0; i<a.length; i++) {
            for (int j=i+1; j<a.length; j++) {
                if (a[i] > a[j]) ret++;
            }
        }
        return ret;
    }
}
