import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static List<Double> v;
	static double max;
	static int n;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		v = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			v.add(sc.nextDouble());
		}
		max = 0.;
		for (int i = 0; i < n; i++) {
			exec(new boolean[n], i, 1, 0, 0.);
		}
		System.out.println(max);
	}
	
	static void exec(boolean[] check, int index, int diff, int count, double sum) {
		if (diff >= n) {
			return;
		} else if (count >= n) {
			if (sum > max) {
				max = sum;
			}
			exec(check, 0, ++diff, 0, 0.);
		} else if (index >= n) {
			int tmp = -1;
			for (int i = index % (n - 1); i < n; i++) {
				if (!check[i]) {
					tmp = i;
					break;
				}
			}
			if (tmp >= 0) {
				exec(check, tmp, diff, count, sum);
			} else {
				for (int i = 0; i < index % (n - 1); i++) {
					if (!check[i]) {
						tmp = i;
						break;
					}
				}
				if (tmp >= 0) {
					exec(check, tmp, diff, count, sum);
				} else {
					return;
				}
			}
		} else {
			if (check[index]) {
				exec(check, ++index, diff, count, sum);
			} else {
				boolean flag = sum > 0.;
				sum += v.get(index);
				if (flag) {
					sum /= 2.;
				}
				check[index] = true;
				++count;
				index += diff;
				exec(check, index, diff, count, sum);
			}
		}
	}
}
