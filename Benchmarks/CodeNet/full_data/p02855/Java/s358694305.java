import java.io.PrintWriter;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int H = Integer.parseInt(sc.next());
        final int W = Integer.parseInt(sc.next());
        final int K = Integer.parseInt(sc.next());
        final char s[][] = new char[H][W];
        int t[][] = new int[H][W];
        for (int i=0; i<H; i++) {
            s[i] =  sc.next().toCharArray();
        }
        sc.close();

        int cnt = 0;
        boolean b = false;
        for (int i=0; i<H; i++) {
            b = false;
            for (int j=0; j<W; j++) {
                if (s[i][j]=='#') {
                    cnt++;
                    t[i][j] = cnt;
                    b = true;
                }
                if (b && s[i][j]=='.') {
                    t[i][j] = cnt;
                }
            }
        }
        for (int i=H-1; i>=0; i--) {
            int c = -1;
            for (int j=W-1; j>=0; j--) {
                if (t[i][j]>0) {
                    c = t[i][j];
                } else if (c>0) {
                    t[i][j] = c;
                }

            }
        }
        for (int j=0; j<W; j++) {
            for (int i=0; i<H; i++) {
                if (t[i][j]==0) {
                    if (i>0) {
                        t[i][j] = t[i-1][j]; 
                    }
                }
            }
        }
        for (int j=0; j<W; j++) {
            for (int i=H-1; i>=0; i--) {
                if (t[i][j]==0) {
                    if (i<H-1) {
                        t[i][j] = t[i+1][j]; 
                    }
                }
            }
        }

        PrintWriter pw = new PrintWriter(System.out);
        for (int i=0; i<H; i++) {
            for (int j=0; j<W; j++) {
                pw.print(t[i][j]);
                if (j<W-1) {
                    pw.print(" ");
                }
            }
            pw.println();
        }
        pw.flush();
    }
}