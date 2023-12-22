import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Washoum
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        inputClass in = new inputClass(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CSugarWater solver = new CSugarWater();
        solver.solve(1, in, out);
        out.close();
    }

    static class CSugarWater {
        public void solve(int testNumber, inputClass sc, PrintWriter out) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();
            int f = sc.nextInt();
            double best = 0;
            int ans1 = 0;
            int ans2 = 0;
            for (int i = 0; ; i++) {
                if (i * 100 * a > f) {
                    break;
                }
                for (int j = 0; ; j++) {
                    if (j * 100 * b + i * 100 * a > f) {
                        break;
                    }
                    int used = j * 100 * b + i * 100 * a;
                    int remaining = f - used;
                    int can_dissolve = Math.min(remaining, e * (used / 100));
                    int needd;
                    int needc;
                    for (needd = 0; ; needd++) {
                        if (needd * d > can_dissolve) {
                            break;
                        }
                        for (needc = 0; ; needc++) {
                            if (needc * c + needd * d > can_dissolve) {
                                break;
                            }
                            if ((100.0 * (needd * d + needc * c)) / (used + needd * d + needc * c) > best) {
                                best = (100.0 * (needd * d + needc * c)) / (used + needd * d + needc * c);
                                ans1 = used + needd * d + needc * c;
                                ans2 = needd * d + needc * c;
                            }
                        }
                    }
                }
            }
            out.println(ans1 + " " + ans2);
        }

    }

    static class inputClass {
        BufferedReader br;
        StringTokenizer st;

        public inputClass(InputStream in) {

            br = new BufferedReader(new InputStreamReader(in));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

