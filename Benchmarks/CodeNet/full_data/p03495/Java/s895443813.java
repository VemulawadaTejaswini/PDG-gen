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
		for (int i = 0; i < (N - 1); i++) {
			for (int k = 0; k < (N - 1); k++) {
				if (data[k] > data[k + 1]) {
					int x = data[k];
					data[k] = data[k + 1];
					data[k + 1] = x;
				}
			}
		}
		int cnt = 1;
		for (int i = 0; i < (N - 1); i++) {
			if (data[i] != data[i + 1]) {
				cnt++;
			}
		}
//		System.out.println("cnt = " + cnt); //debug
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
			/*
			 * for (int i = 0; i < list.size(); i++) { // debug System.out.println(i + " " +
			 * list.get(i)); }
			 */
			int[] Fdata = new int[list.size()];
			for (int i = 0; i < Fdata.length; i++) {
				Fdata[i] = list.get(i);
			}
			for (int i = 0; i < (Fdata.length - 1); i++) {
				for (int k = 0; k < (Fdata.length - 1); k++) {
					if (Fdata[k] > Fdata[k + 1]) {
						int y = Fdata[k];
						Fdata[k] = Fdata[k + 1];
						Fdata[k + 1] = y;
					}
				}
			}
/*			for (int i = 0; i < Fdata.length; i++) { // debug
				System.out.println(i + " " + Fdata[i]);
			}*/
			int ans = 0;
			for (int i = 0; i < (Fdata.length - K); i++) {
				ans += Fdata[i];
			}
			System.out.println(ans);
		}

		sc.close();
	}

}