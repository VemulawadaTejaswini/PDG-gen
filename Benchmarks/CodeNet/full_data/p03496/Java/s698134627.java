import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		List<Answer> ans = new ArrayList<>();
		for (int i = 0; i < n - 1; i++) {
			if (a[i] <= a[i + 1]) {
				continue;
			} else if (a[i] > 0){
				ans.add(new Answer(i, true));
				a[i + 1] = a[i] + a[i + 1];
				i--;
			} else if (a[i] <= 0) {
				ans.add(new Answer(i + 1, false));
				a[i] = a[i] + a[i + 1];
				i--;
			}
		}
		System.out.println(ans.size());
		for (Answer answer : ans) {
			if (answer.isPositive()) {
				System.out.print(answer.getIndex() + 1);
				System.out.print(" ");
				System.out.println(answer.getIndex() + 2);
			} else {
				System.out.print(answer.getIndex() + 1);
				System.out.print(" ");
				System.out.println(answer.getIndex());
			}
		}
	}
}

class Answer {
	private int index;
	private boolean positive;
	public Answer(int index, boolean positive) {
		this.index = index;
		this.positive = positive;
	}
	public int getIndex() {
		return index;
	}
	public boolean isPositive() {
		return positive;
	}
}