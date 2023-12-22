import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str[] = br.readLine().split(" ");

		double v[] = new double[n];
		ArrayList<ArrayList<Double>> list = new ArrayList<ArrayList<Double>>();
		for (int i = 0; i < n; i++) {
			v[i] = Double.parseDouble(str[i]);
		}

		Arrays.sort(v);
		double d = v[0];
		for (int i = 0; i < n; i++) {
			d = (d + v[i]) / 2;
		}
		System.out.println(d);
	}

	static double get(double d[]) {
		if (d.length == 2)
			return (d[0] + d[1]) / 2;
		double dou1[] = new double[d.length / 2];
		double dou2[];
		if (d.length % 3 == 0)
			dou2 = new double[(d.length / 2)];
		else {
			dou2 = new double[(d.length / 2) + 1];
		}
		for (int i = 0; i < d.length / 2; i++) {
			dou1[i] = d[i];
			if (d.length % 3 == 0)
				dou2[i] = d[i + (d.length / 2)];
			else {
				dou2[i] = d[i + ((d.length / 2) + 1)];
			}

		}
		return (get(dou1) + get(dou2)) / 2;
	}
}