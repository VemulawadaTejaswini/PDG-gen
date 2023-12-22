import java.util.*;

public class Main {

    static char[][] s;
    static int[][] a;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int K = sc.nextInt();
        s = new char[h][w];
        a = new int[h][w];
        for (int i = 0; i < h; i++) {
            s[i] = sc.next().toCharArray();
            for (int j = 0; j < w; j++) {
                a[i][j] += s[i][j] == '1' ? 1 : 0;
                if(0 < i) a[i][j] += a[i-1][j];
            }
        }
        int ans = (h)*(w);
        for (int i = 0; i < 1<<(h-1); i++) {
            int t = 0;
            int hc = Integer.bitCount(i);
            int[] hd = new int[hc+1];
            int idx = 0;
            for (int j = 0; j < h-1; j++) if((i>>j & 1) == 1) hd[idx++] = j;
            hd[hc] = h-1;
            int[] ts = new int[hc+1];
            int widx = -1;
            OUTER:for (int j = 0; j < w; j++) {
                INNER:for (int k = 0; k < hd.length; k++) {
                    ts[k] += a[hd[k]][j];
                    if(0 < k) ts[k] -=  a[hd[k-1]][j];
//                    if(ts[k] == K && j!=w-1) widx = j;
                    if(K < ts[k]){
                        if(widx == j-1){
                            t = -1;
                            break OUTER;
                        }
                        widx = j-1;
                        j--;
                        break INNER;
                    }
                }
                if(-1 < widx){
                    t++;
                    Arrays.fill(ts, 0);
                    widx = -1;
                }
            }
            if(t < 0) continue;
            t += hc;
            if(t < ans) ans = t;
        }
        System.out.println(ans);
        sc.close();

    }

}
