import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n+1];
        int[] b = new int[n];
        for(int i=0; i<=n; i++) {
            a[i] = in.nextInt();
        }
        for(int i=0; i<n; i++) {
            b[i] = in.nextInt();
        }
        int c = 0;
        for(int i=0; i<n; i++) {
            int d = Math.min(a[i], b[i]);
            if(b[i] > d) {
                int d2 = Math.min(a[i+1], b[i]-d);
                a[i+1] -= d2;
                d += d2;
            }
            c += d;
        }
        System.out.println(c);
    }
}
