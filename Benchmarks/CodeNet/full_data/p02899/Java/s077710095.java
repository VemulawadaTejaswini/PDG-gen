import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());

		int[] stu = new int[n];

		for (int i = 0; i < n; i++) {
			stu[sc.nextInt() - 1] = i;
		}

		for (int i = 0; i < n; i++) {
			System.out.print(i == 0 ? "" : " ");
			System.out.print(stu[i]+1);
		}
		System.out.println();

	}
}