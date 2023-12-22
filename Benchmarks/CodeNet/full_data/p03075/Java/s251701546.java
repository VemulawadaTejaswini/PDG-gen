import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int[] a = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int k = sc.nextInt();

		for(int i = 0; i < a.length - 1; i++) {
			for(int j = i + 1; j < a.length; j++) {
				if (Math.abs(a[i] - a[j]) > k) {
					System.out.println(":(");
					return;
				}
			}
		}

		System.out.println("Yay!");
	}

}