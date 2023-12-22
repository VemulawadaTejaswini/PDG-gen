import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {
    public static int MAX = 301;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = sc.nextInt();
        int[] cnt = new int[4];
        for(int i = 0; i < n; i++) {
            cnt[sc.nextInt()]++;
        }
        double p[][][] = new double[MAX][MAX][MAX];
        double e[][][] = new double[MAX][MAX][MAX];
        p[cnt[1]][cnt[2]][cnt[3]] = 1;
        for(int c = n; c >= 0; c--) {
            for(int b = n; b >= 0; b--) {
                for(int a = n; a >= 0; a--) {
                    if(a == 0 && b == 0 && c == 0) {
                        continue;
                    }
                    if(a + b + c > n) {
                        continue;
                    }
                    double pWaste = (double) (n - (a + b + c)) / (n * 1.0);
                    double eWaste = pWaste / (1 - pWaste) + 1;
                    e[a][b][c] += eWaste * p[a][b][c];
                    if(a != 0) {
                        double pGo = (double) a / ((a + b + c) * 1.0);
                        p[a - 1][b][c] += p[a][b][c] * pGo;
                        e[a - 1][b][c] += e[a][b][c] * pGo;
                    }
                    if(b != 0) {
                        double pGo = (double) b / ((a + b + c) * 1.0);
                        p[a + 1][b - 1][c] += p[a][b][c] * pGo;
                        e[a + 1][b - 1][c] += e[a][b][c] * pGo;
                    }
                    if(c != 0) {
                        double pGo = (double) c / ((a + b + c) * 1.0);
                        p[a][b + 1][c - 1] += p[a][b][c] * pGo;
                        e[a][b + 1][c - 1] += e[a][b][c] * pGo;
                    }
                }
            }
        }
        System.out.println(e[0][0][0]);
    }
}
