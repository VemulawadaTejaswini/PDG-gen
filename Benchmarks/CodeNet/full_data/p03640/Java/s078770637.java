import java.util.*;
import java.io.*;
public class Main {
    void solve(BufferedReader in) throws Exception {
        int[] xx = toInts(in.readLine());
        int H = xx[0], W = xx[1];
        int N = toInt(in.readLine());
        int[] a = toInts(in.readLine());
        int[][] b = new int[H][W];
        int count = 0;
        for(int i = 0; i<H; i++) {
            if(i%2 == 0) {
                for(int j = 0; j<W; j++) {
                    if(a[count] == 0) count++;
                    b[i][j] = count+1;
                    a[count]--;
                }
            } else {
                for(int j = W - 1; j>=0; j--) {
                    if(a[count] == 0) count++;
                    b[i][j] = count+1;
                    a[count]--;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<H; i++) {
            for(int j = 0; j<W; j++) {
                sb.append(b[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
    int toInt(String s) {return Integer.parseInt(s);}
    int[] toInts(String s) {
        String[] a = s.split(" ");
        int[] o = new int[a.length];
        for(int i = 0; i<a.length; i++) o[i] = toInt(a[i]);
        return o;
    }
    void e(Object o) {
        System.err.println(o);
    }
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        (new Main()).solve(in);
    }
}
