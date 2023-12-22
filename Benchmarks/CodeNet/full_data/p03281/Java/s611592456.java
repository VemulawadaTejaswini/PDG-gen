import java.util.*;

public class Main {

	static int p[];

	public static void inip(int n) {
		int tmp[] = new int[n + 1];
		tmp[0] = tmp[1] = -1;
		tmp[2] = 1;
		for (int i = 0; i <= n; ++i) {
			if (tmp[i] != -1) {
				tmp[i] = 1;
				for (int j = 2; j * i <= n; ++j) {
					tmp[i * j] = -1;
				}
			}
		}
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 3; i <= n; ++i) {
			if (tmp[i] == 1)
				list.add(i);
		}
		p = new int[list.size()];
		for (int i = 0; i < list.size(); ++i) {
			p[i] = list.get(i);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		inip(n);
		sc.close();
		int cnt = 0;
		for (int i = 0; i < p.length; ++i) {
			int tmp = (int) Math.pow(p[i], 3);
			if (tmp < n) {
				int tmp2 = (int) Math.pow(p[i], 7);
				if (tmp2 <= n)
					++cnt;
			}
			for (int j = i + 1; j < p.length; ++j) {
				if (tmp < n) {
					if (tmp * p[j] <= n)
						++cnt;
				}
				if (p[i] * p[j] < n) {
					int tmp2 = p[i] * p[j];
					for (int k = j + 1; k < p.length; ++k) {
						if (tmp2 * p[k] <= n)
							++cnt;
					}
				}
			}
		}
		System.out.println(cnt);
	}

}
