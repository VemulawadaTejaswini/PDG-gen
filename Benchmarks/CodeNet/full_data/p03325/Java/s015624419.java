import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(sc.next());
		}
		long ans = 0;
		while (true) {
			int index = 0;
			int max = 0;
			for (int i = 0; i < n; i++) {
				long tem = a[i];
				int count = 0;
				while (tem % 2 == 0) {
					tem /= 2;
					count++;
				}
				if (count > max) {
					max = count;
					index = i;
				}
			}
			if (max == 0)
				break;
			a[index] /= 2;
			/*for (int i = 0; i < n; i++) {
				if (!(i == index))
					a[i] *= 3;
			}*/
			ans++;
		}
		System.out.println(ans);
	}
}