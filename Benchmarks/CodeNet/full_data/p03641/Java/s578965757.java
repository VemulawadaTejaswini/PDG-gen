import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solveE();
	}

	private void solveE() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			list.add(sc.nextInt());
		}
		int[] answer = new int[N];
		int cp = N - 2;
		int size = N;
		while (!list.isEmpty()) {
			int max = 0;
			int secmax = 0;
			int maxi = 0;
			for (int i = 0; i < size - 1; i++) {
				int tmp = list.get(i);
				int tmp2 = list.get(i + 1);
				int tmpb = tmp < tmp2 ? tmp : tmp2;
				int tmps = tmp < tmp2 ? tmp2 : tmp;
				if (max < tmpb) {
					max = tmpb;
					secmax = tmps;
					maxi = i;
				} else if (max == tmpb && secmax < tmps) {
					secmax = tmps;
					maxi = i;
				}
			}
			answer[cp] = list.get(maxi);
			answer[cp + 1] = list.get(maxi + 1);
			size -= 2;
			cp -= 2;
			list.remove(maxi + 1);
			list.remove(maxi);
		}
		for (int i = 0; i < N - 1; i++) {
			System.out.print(answer[i] + " ");
		}
		System.out.println(answer[N - 1]);
	}
}