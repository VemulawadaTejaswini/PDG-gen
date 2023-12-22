import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main  implements Runnable {
	public static void main(String[] args) {
		new Thread(null, new Main(), "", 32 * 1024 * 1024).start(); //
	}
	public void run() {
		FastScanner sc = new FastScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());

		long ans = 0;
		double[] x = new double[n];
		double[] y = new double[n];
		double[] xs = new double[n];
		double[] ys = new double[n];
		//double[] ang = new double[n];
		for (int i = 0; i < n; i++) {
			x[i] = Double.parseDouble(sc.next());
			y[i] = Double.parseDouble(sc.next());
			double[] tmp = gets(x[i], y[i]);
			xs[i] = tmp[0];
			ys[i] = tmp[1];
		}
		double max_ans = 0;
		for (int i = 0; i < 40000; i++) {
			ArrayList<Integer> ar = new ArrayList<Integer>();
			//ar.add(i);
			double x_i = Math.cos(2*Math.PI/((double)i/(double)40000));
			double y_i = Math.sin(2*Math.PI/((double)i/(double)40000));
			double tmp_ans = 1;
			for (int j = 0; j < n; j++) {
				if(j!=i)
				{
					//double tmp2_ans = len2(xs[i]+xs[j], ys[i]+ys[j]);
					double tmp2_ans = len2(x_i+xs[j], y_i+ys[j]);
					if(tmp2_ans > tmp_ans)
					{
						ar.add(j);
					}
				}
			}
			tmp_ans = 0;
			double tmp_x=0;
			double tmp_y=0;
			for (int j = 0; j < ar.size(); j++) {
				tmp_x += x[ar.get(j)];
				tmp_y += y[ar.get(j)];
			}
			tmp_ans = Math.sqrt(len2(tmp_x, tmp_y));
			max_ans = Math.max(tmp_ans, max_ans);
		}
		out.println(max_ans);
		out.flush();
	}

	double len2 (double x, double y)
	{
		return (x*x+y*y);
	}
	double[] gets(double x, double y)
	{
		double[] ans = new double[2];
		double tmp = len2(x,y);
		tmp = Math.sqrt(tmp);
		ans[0] = x/tmp;
		ans[1] = y/tmp;
		return ans;
	}
    static class FastScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;
        public FastScanner(String in) {
        	StringReader sr = new StringReader(in);
            reader = new BufferedReader(new BufferedReader(sr));
            tokenizer = null;
        }
        public FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }
        public String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
    }
}