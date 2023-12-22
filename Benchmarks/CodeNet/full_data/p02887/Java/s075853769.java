import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//標準入力取得
		int num = sc.nextInt();
		String row = sc.next();

		int numSlime = 0;
		char preSlime = 'X';
		for (int i = 0; i < num; i++) {
			if (preSlime != row.charAt(i)) {
				preSlime = row.charAt(i);
				numSlime++;
			}
		}
		System.out.println(numSlime);

		sc.close();

	}

}
