import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EHandshake solver = new EHandshake();
        solver.solve(1, in, out);
        out.close();
    }

    static class EHandshake {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int n = in.nextInt();
            long m = in.nextLong();
            int[] f = new int[100005];
            for (int i = 0; i < n; i++) {
                f[in.nextInt()]++;
            }

            double[][] res = Arith.convolve(f, f);
            long happiness = 0;
            int idx = res[0].length - 1;

            while (m > 0) {
                long cnt = Math.min(Math.round(res[0][idx]), m);
                happiness += cnt * idx;
                m -= cnt;
                idx--;
            }
            out.println(happiness);

        }

    }

    static class Arith {
        public static double[][] convolve(int[] a, int[] b) {
            // 次数上界がna(>0)である多項式A(x)の係数ベクトルをa[]、
            // 次数上界がnb(>0)である多項式B(x)の係数ベクトルをb[]とした時に、
            // A(x)とB(x)の乗算の結果である多項式C(x)の係数ベクトルを戻り値として返す。
            // C(x)の次数上界はna+nb-1。
            // a, bの配列は変更しない
            // 複素演算を用いたFFT。(再帰なし。アルゴリズムイントロダクション30.3参照)
            int na = a.length;
            int nb = b.length;
            int m = Math.max(na, nb);
            int n = Integer.highestOneBit(2 * m - 1) << 1;

            double[][] ca = new double[2][n];
            double[][] cb = new double[2][n];
            for (int i = 0; i < na; i++) {
                ca[0][i] = a[i];
            }
            for (int i = 0; i < nb; i++) {
                cb[0][i] = b[i];
            }

            ca = FFT(ca, false);
            cb = FFT(cb, false);

            for (int i = 0; i < n; i++) {
//			ca[i] = ca[i].multiply(cb[i]);
                double rtmp = ca[0][i] * cb[0][i] - ca[1][i] * cb[1][i];
                double itmp = ca[0][i] * cb[1][i] + ca[1][i] * cb[0][i];
                ca[0][i] = rtmp;
                ca[1][i] = itmp;
            }

//		Complex[] ret = Arrays.copyOf(FFT(ca, true), na + nb - 1);
            double[][] ret = FFT(ca, true);
            ret[0] = Arrays.copyOf(ret[0], na + nb - 1);
            ret[1] = Arrays.copyOf(ret[1], na + nb - 1);
            for (int i = 0; i < na + nb - 1; i++) {
                ret[0][i] /= n;
                ret[1][i] /= n;
            }

            return ret;
        }

        private static double[][] FFT(double[][] a, boolean inverse) {
            // 複素数の係数ベクトルaを持つ多項式を、
            // 1の原始n乗根のべき乗の点で評価(evaluation)する
            // inverseがtrueの時は、補間(interporation)になる。(1/nはしない)
            // aの内容は戻り値に変更される。
            int n = a[0].length;

//		Complex[] ret = new Complex[n];
            double[][] ret = a;
//		double[][] ret = new double[2][n];
            for (int k = 0; k < n; k++) {
                int rev = Integer.reverse(k);
                rev >>>= Integer.numberOfLeadingZeros(n) + 1;

                if (k < rev) {
                    double tmp = ret[0][k];
                    ret[0][k] = ret[0][rev];
                    ret[0][rev] = tmp;
                    tmp = ret[1][k];
                    ret[1][k] = ret[1][rev];
                    ret[1][rev] = tmp;
                }
//			ret[0][rev] = a[0][k];
//			ret[1][rev] = a[1][k];
            }

            for (int m = 2; m <= n; m *= 2) {
                double th = 2 * Math.PI / m;
                double[] wn = {Math.cos(th), Math.sin(th)};
                if (inverse) {
                    wn[1] = -wn[1];
                }

                for (int k = 0; k < n; k += m) {
//				Complex w = new Complex(1, 0);
                    double[] w = new double[2];
                    w[0] = 1;

//				Complex t = new Complex(0, 0);
                    double[] t = new double[2];
                    for (int j = 0; j < m / 2; j++) {
//					Complex t = w.multiply(ret[k + j + m / 2]);
                        double tmp0 = ret[0][k + j + m / 2];
                        double tmp1 = ret[1][k + j + m / 2];
                        t[0] = w[0] * tmp0 - w[1] * tmp1;
                        t[1] = w[0] * tmp1 + w[1] * tmp0;
                        ret[0][k + j + m / 2] = ret[0][k + j] - t[0];
                        ret[1][k + j + m / 2] = ret[1][k + j] - t[1];
                        ret[0][k + j] = ret[0][k + j] + t[0];
                        ret[1][k + j] = ret[1][k + j] + t[1];

//					w = w.multiply(wn);
                        double rtmp = w[0] * wn[0] - w[1] * wn[1];
                        double itmp = w[0] * wn[1] + w[1] * wn[0];
                        w[0] = rtmp;
                        w[1] = itmp;
                    }
                }
            }

            return ret;
        }

    }
}

