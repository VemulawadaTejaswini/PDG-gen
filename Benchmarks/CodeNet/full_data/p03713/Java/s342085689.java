import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        System.out.println( solve(H, W) );
    }

    private static int solve(int H, int W) {
        int tate3 = calcTate3(H, W);
        int yoko3 = calcTate3(W, H);
        int tateYoko = calcTateYoko(H, W);
        int yokoTate = calcTateYoko(W, H);

        return Math.min(Math.min(tate3, yoko3), Math.min(tateYoko, yokoTate));
    }

    private static int calcTate3(int H, int W) {
        if( W < 3 ) return Integer.MAX_VALUE;

        if( W % 3 == 0 ) {
            return 0;
        } else {
            return H;
        }
    }

    // 縦に切った後、横に切る
    private static int calcTateYoko(int H, int W) {
        // 余りを割り振る
        int hq = H / 3;
        int hr = H % 3;

        int h1;
        if( hr == 0 ) {
            h1 = hq;
        } else if( hr == 1 ) {
            h1 = hq;
        } else {
            h1 = hq + 1;
        }
        int h2 = H - h1;

        int wq = W / 2;
        int wr = W % 2;

        int w1 = wr == 1 ? wq + 1 : wq;
        int w2 = W - w1;

        int c1 = h1 * W;
        int c2 = h2 * w1;
        int c3 = h2 * w2;

        int max = Math.max(Math.max(c1, c2), c3);
        int min = Math.min(Math.min(c1, c2), c3);
        return max - min;
    }
}
