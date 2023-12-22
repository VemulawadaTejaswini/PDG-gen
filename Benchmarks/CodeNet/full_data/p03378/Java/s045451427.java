import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int x = scanner.nextInt();
		int idx = 0;
		for (int i=1;i<=m; i++) {
			int num = scanner.nextInt();
			if (num<x) {
				idx = i;
			}else {
				break;
			}
		}
		if (idx<=m-idx) {
			System.out.println(idx);
		}else {
			System.out.println(m-idx);
		}

	}

}