import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Main main = new Main();
		main.solve();
	}

	void solve() throws Exception {
		try (Scanner cin = new Scanner(System.in)) {
			int count = cin.nextInt();
			int[] list = new int[1];
			int index = 0;

			while (cin.hasNext()) {
				list[index] = cin.nextInt();
				list = test(list, index);
				index++;
			}

			for (int i = 0; i < count; i++) {
				if (i != 0) {
					System.out.print(" ");
				}
				System.out.print(list[i]);
			}
		} finally {
		}
	}

	int[] test(int[] list, int length) {
		int[] ans = new int[length + 2];
		for (int i = 0; i < list.length; i++) {
			ans[list.length - i - 1] = list[i];
		}

		return ans;
	}

}
