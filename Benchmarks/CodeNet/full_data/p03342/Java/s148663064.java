
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        int[][] bits = new int[n+2][20];
        for(int i=0; i<n; i++) {
            for(int j=0; j<20; j++) {
                if((a[i] >> j) % 2 == 1) {
                    bits[i+1][j] = 1;
                } else {
                    bits[i+1][j] = 0;
                }
            }
//            print(bits[i+1]);
        }
        Arrays.fill(bits[n+1], 2);

        int r = 1;
        int[] sum = new int[20];
        add(sum, bits[1]);
        int res = 0;
        for(int l=1; l<=n; l++) {
            while(true) {
                add(sum, bits[r+1]);
                // System.out.print(l + ":" + (r+1) + " ");
                // print(sum);
                if(ok(sum)) {
                    r++;
                } else {
                    sub(sum, bits[r+1]);
                    break;
                }
            }
            sub(sum, bits[l]);
            res += r - l + 1;
            if(r == l) {
                r++;
                add(sum, bits[r]);
            }
        }

        System.out.println(res);
    }
    static void print(int[] a) {
        System.out.println(Arrays.toString(a));
    }

    static void add(int[] a, int b[]) {
        for(int i=0; i<a.length; i++) {
            a[i] += b[i];
        }
    }
    static void sub(int[] a, int b[]) {
        for(int i=0; i<a.length; i++) {
            a[i] -= b[i];
        }
    }
    static boolean ok(int[] a) {
        for(int i=0; i<a.length; i++) {
            if(a[i] > 1) return false;
        }
        return true;
    }
}
