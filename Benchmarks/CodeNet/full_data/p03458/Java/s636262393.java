import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int k2 = k * 2;
        int[][] b = new int[k2][k2];
        int[][] w = new int[k2][k2];
        int[][] bs = new int[k2][k2];
        int[][] ws = new int[k2][k2];

        for(int i=0; i<n; i++) {
            int x = sc.nextInt() % k2;
            int y = sc.nextInt() % k2;
            if (sc.next().equals("W")) {
                w[x][y] ++;
            } else {
                b[x][y] ++;
            }
        }

        bs[0][0] = b[0][0];
        ws[0][0] = w[0][0];
        for(int i=1; i<k2; i++) {
            bs[i][0] = bs[i-1][0] + b[i][0];
            bs[0][i] = bs[0][i-1] + b[0][i];
            ws[i][0] = ws[i-1][0] + w[i][0];
            ws[0][i] = ws[0][i-1] + w[0][i];
        }
        for(int x=1; x<k2; x++) {
            for(int y=1; y<k2; y++) {
                bs[x][y] = bs[x-1][y] + bs[x][y-1] - bs[x-1][y-1] + b[x][y];
                ws[x][y] = ws[x-1][y] + ws[x][y-1] - ws[x-1][y-1] + w[x][y];
            }
        }
        int max = 0;
        for(int x=0; x<k; x++) {
            for(int y=0; y<k; y++) {
                max = Math.max(max, sum1(bs, x, y, k) + sum2(ws, x, y, k));
                max = Math.max(max, sum1(ws, x, y, k) + sum2(bs, x, y, k));
            }
        }
        System.out.println(max);
    }


    static int sum2(int[][] a, int x, int y, int k) {
        return a[k*2-1][k*2-1] - sum1(a, x, y, k);
    }

    static int sum1(int[][] a, int x, int y, int k) {
        int res = 0;
        res += sum(a, 0,0,x, y);
        res += sum(a, x+k,0, k*2, y);
        res += sum(a, x,y,x+k, y+k);
        res += sum(a, 0, y+k, x, k*2);
        res += sum(a, x+k,y+k, k*2, k*2);
        return res;
    }

    static int sum(int[][] a, int x0, int y0, int x1, int y1) {
        if(x0 == x1 || y0 == y1) return 0;
        if(x0 == 0 && y0 == 0) {
            return a[x1-1][y1-1];
        }
        if(x0 == 0) {
            return a[x1-1][y1-1] - a[x1-1][y0-1];
        }
        if(y0 == 0) {
            return a[x1-1][y1-1] - a[x0-1][y1-1];
        }
        return a[x1-1][y1-1] - a[x0-1][y1-1] - a[x1-1][y0-1] + a[x0-1][y0-1];
    }
}
