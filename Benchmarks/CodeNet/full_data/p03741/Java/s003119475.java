import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Main main = new Main();
		main.solveC();
	}

	private void solveC() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		int sum = 0;
		int ans = 0;
		for (int tmp : list) {
			if (sum == 0) {
				sum = tmp;
				if (sum == 0) {
					sum++;
					ans++;
				}
			} else if (sum < 0) {
				if (sum + tmp > 0) {
					sum += tmp;
				} else {
					ans += 1 - (sum + tmp);
					sum = 1;
				}
			} else {
				if (sum + tmp < 0) {
					sum += tmp;
				} else {
					ans += (sum + tmp) + 1;
					sum = -1;
				}
			}
		}
		System.out.println(ans);
	}
}