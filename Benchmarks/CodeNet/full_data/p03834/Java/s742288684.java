import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 入力1をnに入れる
		int k = sc.nextInt();
		int s = sc.nextInt();
		int count = 0;

		for (int i = 0; i <= k; i++) {
			if (s < i)
				break;
			for (int j = 0; j <= k; j++) {
				if (s < i + j)
					break;
				for (int l = 0; l <= k; l++) {
					if (s < i + j + l)
						break;
					if (i + j + l == s) {
						count++;
						break;
						//						System.out.print("i: " + i);
						//						System.out.print(" j: " + j);
						//						System.out.println(" l: " + l);
						//						if ( s <= l) break;
					}
				}
			}
		}

		System.out.println(count);
	}
}