import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] aa = new int[n];
        int[] bb = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = aa[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++) {
            b[i] = bb[i] = sc.nextInt();
        }
        Arrays.sort(bb);
        Arrays.sort(aa);
        for(int i=0; i<n; i++) {
            if(aa[i]>bb[i]) {
                System.out.println("No");
                return;
            }
        }
        for(int i=0; i<n; i++) {
            int p = Arrays.binarySearch(aa, b[i]);
            if(p == n) {
                b[i] = aa[n-1];
            } else if (p >= 0) {
                b[i] = aa[p];
            } else {
                b[i] = aa[-2-p];
            }
            bb[i] = b[i];
        }
        Arrays.sort(bb);

        for(int i=1; i<n; i++) {
            if(bb[i-1]==bb[i]) {
                System.out.println("Yes");
                return;
            }
        }
        for(int i=0; i<n; i++) {
            if(a[i] == b[i]) {
                System.out.println("Yes");
                return;
            }
        }
        int[] aaa = new int[n];
        int[] bbb = new int[n];

        P[] pa = new P[n];
        for(int i=0; i<n; i++) {
            pa[i] = new P(Arrays.binarySearch(aa, a[i]),  Arrays.binarySearch(aa, b[i]));
        }
        Arrays.sort(pa);
        boolean[] v = new boolean[n];
        v[0] = true;
        int q = 0;
        while(true) {
            int next = pa[q].b;
            if(v[next]) break;
            v[next] = true;
            q = next;
        }
        for(int i=0; i<n; i++) {
            if(!v[i]) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }

    static class P implements Comparable<P> {
        int a;
        int b;
        public P(int a, int b) {
            this.a = a;
            this.b = b;
        }
        @Override public int compareTo(P o) {
            return a - o.a;
        }
    }
}
