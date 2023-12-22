import java.util.*;

class Main {
    static int N;
    static int[] A, B;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = 100000;
        int n = sc.nextInt();
        int M = sc.nextInt();
        A = new int[100005];
        B = new int[100005];
        for (int i = 0; i < n; ++i) {
            int X = sc.nextInt();
            A[X]++;
            B[X]++;
        }
        ArrayList<Long> list = mul(B, B);
        // for (int i=0;i<15;i++) {
        //     System.out.println(list.get(i));
        // }

        int tmp_M = M;
        long ans = 0;
        for (int i=list.size()-1;i>=0;i--) {
            if (list.get(i)<tmp_M) {
                tmp_M-=list.get(i);
                ans += list.get(i)*(i+1);
            } else {
                ans += tmp_M*(i+1);
                tmp_M=0;
            }
            if (tmp_M<=0) break;
        }
        System.out.println(ans);
    }

    static ArrayList<Long> mul(int[] a, int[] b) {
        int n = 1;
        while (n < a.length + b.length)
            n *= 2;
        Complex[] ac = new Complex[n];
        Complex[] bc = new Complex[n];
        for (int i = 0; i < n; ++i) {
            ac[i] = new Complex(0, 0);
            bc[i] = new Complex(0, 0);
        }
        for (int i = 0; i < a.length; ++i) {
            ac[i].re = a[i];
        }
        for (int i = 0; i < b.length; ++i) {
            bc[i].re = b[i];
        }
        ac = fft(ac, false);
        bc = fft(bc, false);
        for (int i = 0; i < ac.length; ++i) {
            ac[i] = ac[i].mul(bc[i]);
        }
        ac = fft(ac, true);
        for (int i = 0; i < ac.length; ++i) {
            ac[i].re /= n;
            ac[i].co /= n;
        }
        ArrayList<Long> list = new ArrayList<Long>();
        for (int i = 1; i <= 2 * N; ++i) {
            // System.out.println(Math.round(ac[i].re));
            list.add((long)Math.round(ac[i].re));
        }
        return list;

    }

    static Complex[] fft(Complex[] a, boolean rev) {
        int n = a.length;
        if (n == 1)
            return a;
        int c = 0;
        for (int i = 1; i < n; ++i) {
            int j;
            for (j = n >> 1; j > (c ^= j); j >>= 1)
                ;
            if (c > i) {
                Complex tmp = a[c];
                a[c] = a[i];
                a[i] = tmp;
            }
        }

        for (int d = 1; d < n; d <<= 1) {
            for (int j = 0; j < d; ++j) {
                Complex mul = exp(2 * Math.PI / (2 * d) * (rev ? -1 : 1) * j);
                for (int pos = 0; pos < n; pos += 2 * d) {
                    double ure = a[pos + j].re;
                    double uco = a[pos + j].co;
                    double vre = a[pos + j + d].re * mul.re - a[pos + j + d].co * mul.co;
                    double vco = a[pos + j + d].co * mul.re + a[pos + j + d].re * mul.co;
                    a[pos + j].re = ure + vre;
                    a[pos + j].co = uco + vco;
                    a[pos + j + d].re = ure - vre;
                    a[pos + j + d].co = uco - vco;
                }
            }
        }
        return a;
    }

    static class Complex {
        double re, co;

        public Complex(double re, double co) {
            this.re = re;
            this.co = co;
        }

        Complex add(Complex o) {
            return new Complex(re + o.re, co + o.co);
        }

        Complex subtract(Complex o) {
            return new Complex(re - o.re, co - o.co);
        }

        Complex mul(Complex o) {
            return new Complex(re * o.re - co * o.co, re * o.co + o.re * co);
        }
    }

    static Complex exp(double theta) {
        return new Complex(Math.cos(theta), Math.sin(theta));
    }
}
