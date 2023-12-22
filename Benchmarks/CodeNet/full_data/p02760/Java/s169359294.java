import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int maxn;
    long[] frac,inv;
    long mod = 1000000000+7;
    public static void main(String[] args) throws IOException {
        Main main = new Main();
//        main.solve();
        System.out.println(main.solve());
    }
    String solve() throws IOException {
        int[][] a = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++) a[i][j] = sc.nextInt();
        }
        int n = sc.nextInt();
        boolean[] b = new boolean[105];
        for(int i=0;i<n;i++){
            int t = sc.nextInt();
            b[t] = true;
        }
        // row
        for(int i=0;i<3;i++){
            boolean flag = b[a[i][0]]&&b[a[i][1]]&&b[a[i][2]];
            if(flag) return "Yes";
        }
        // col
        for(int j=0;j<3;j++){
            boolean flag = b[a[0][j]]&&b[a[1][j]]&&b[a[2][j]];
            if(flag) return "Yes";
        }
        // dia
        boolean flag = b[a[0][0]]&&b[a[1][1]]&&b[a[2][2]];
        flag |= b[a[0][2]]&&b[a[1][1]]&&b[a[2][0]];
        return flag?"Yes":"No";

    }
}

