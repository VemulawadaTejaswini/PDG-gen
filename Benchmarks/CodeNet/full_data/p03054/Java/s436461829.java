import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int H = scan.nextInt();
        int W = scan.nextInt();
        int N = scan.nextInt();
        int sr = scan.nextInt();
        int sc = scan.nextInt();
        String S = scan.next();
        String T = scan.next();

        int[][] cnt = new int[N][4];
        int[][] max = new int[N][4];
        for (int i=N-1;i>=0;i--) {
            if (i!=N-1) {
                for (int j=0;j<4;j++) {
                    cnt[i][j] = cnt[i+1][j];
                }
            }

            if (S.charAt(i)=='L') cnt[i][0]++;
            if (S.charAt(i)=='R') cnt[i][1]++;
            if (S.charAt(i)=='U') cnt[i][2]++;
            if (S.charAt(i)=='D') cnt[i][3]++;

            for (int j=0;j<4;j++) {
                max[i][j] = cnt[i][j];
            }

            if (T.charAt(i)=='L' && cnt[i][1]>0) cnt[i][1]--;
            if (T.charAt(i)=='R' && cnt[i][0]>0) cnt[i][0]--;
            if (T.charAt(i)=='U' && cnt[i][3]>0) cnt[i][3]--;
            if (T.charAt(i)=='D' && cnt[i][2]>0) cnt[i][2]--;
        }

        // System.out.println(Arrays.deepToString(max));

        int x = sc-1;
        for (int i=0;i<N;i++) {
            if (S.charAt(i)=='L') x--;
            if (x<0 || (i+1<N && W<=x+max[i+1][1])) {
                // System.out.println("A");
                System.out.println("NO");
                return;
            }
            if (T.charAt(i)=='R') {
                if (x+1<W) x++;
            }
        }

        x = sc-1;
        for (int i=0;i<N;i++) {
            if (S.charAt(i)=='R') x++;
            if ((i+1<N && x-max[i+1][0]<0) || W<=x) {
                // System.out.println("B");
                // System.out.println("i, x "+i+" "+x);
                System.out.println("NO");
                return;
            }
            if (T.charAt(i)=='L') {
                if (0<=x-1) x--;
            }
        }

        int y = sr-1;
        for (int i=0;i<N;i++) {
            if (S.charAt(i)=='U') y++;
            if ((i+1<N && y-max[i+1][3]<0) || H<=y) {
                // System.out.println("C");
                System.out.println("NO");
                return;
            }
            if (T.charAt(i)=='D') {
                if (0<y-1) x--;
            }
        }

        y = sr-1;
        for (int i=0;i<N;i++) {
            if (S.charAt(i)=='D') y--;
            if (y<0 || (i+1<N && H<=y+max[i+1][2])) {
                // System.out.println("D");
                System.out.println("NO");
                return;
            }
            if (T.charAt(i)=='U') {
                if (y+1<H) y++;
            }
        }

        System.out.println("YES");
    }
}
