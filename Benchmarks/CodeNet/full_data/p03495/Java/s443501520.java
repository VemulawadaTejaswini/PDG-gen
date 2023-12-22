import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] data = new int[N];
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			data[i] = sc.nextInt();
		}
		Arrays.sort(data);
		int cnt = 1;
		for (int i = 0; i < (N - 1); i++) {
			if (data[i] != data[i + 1]) {
				cnt++;
			}
		}
		if (cnt <= K) {
			System.out.println(0);
		} else {
			int x = 1;
			for (int i = 0; i < data.length; i++) {
				if (i == (data.length - 1)) {
					list.add(x);
				} else if (data[i] == data[i + 1]) {
					x++;
				} else {
					list.add(x);
					x = 1;
				}
			}
			int[] Fdata = new int[list.size()];
			for (int i = 0; i < Fdata.length; i++) {
				Fdata[i] = list.get(i);
			}
			Arrays.sort(Fdata);
			int ans = 0;
			for (int i = 0; i < (Fdata.length - K); i++) {
				ans += Fdata[i];
			}
			System.out.println(ans);
		}

		sc.close();
	}

}