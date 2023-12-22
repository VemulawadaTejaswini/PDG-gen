import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] x = new int[n];
		int[] y = new int[n];
		for (int i = 0; i < n; i++) {
			String[] sa = br.readLine().split(" ");
			x[i] = Integer.parseInt(sa[0]);
			y[i] = Integer.parseInt(sa[1]);
		}
		br.close();

		double p2 = Math.PI * 2;
		for (int i = 0; i < n; i++) {
			TreeMap<Double, Double> map = new TreeMap<>();
			map.put(0d, p2);
			for (int j = 0; j < n; j++) {
				if (i != j) {
					double d = Math.atan2(y[j] - y[i], x[j] - x[i]);
					d += Math.PI / 2 + p2;
					d %= p2;
					if (d < Math.PI) {
						double d2 = d + Math.PI;
						Double l = map.lowerKey(d);
						Double l2 = map.lowerKey(d2);
						if (l2 != null) {
							if (l != l2) {
								map.put(l2, Math.min(d2, map.get(l2)));
							}
						}
						if (l != null) {
							map.put(d, Math.min(d2, map.get(l)));
							map.remove(l);
						}
						Double h2 = map.ceilingKey(d2);
						if (h2 != null) {
							map.remove(h2);
						}
					} else {
						double d2 = d - Math.PI;
						Double l = map.lowerKey(d);
						Double l2 = map.lowerKey(d2);
						Double h = map.ceilingKey(d);
						if (l != null) {
							if (l == l2) {
								if (map.get(l) > d) {
									map.put(d, Math.min(p2, map.get(l)));
								}
							} else {
								if (h == null) {
									map.put(d, Math.min(p2, map.get(l)));
								}
								map.remove(l);
							}
						}
						if (l2 != null) {
							map.put(l2, Math.min(d2, map.get(l2)));
						}
					}
				}
			}
			double val = 0;
			for (Double d : map.keySet()) {
				val += map.get(d) - d;
			}
			System.out.println(val / p2);
		}
	}
}
