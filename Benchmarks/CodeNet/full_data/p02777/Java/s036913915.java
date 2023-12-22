import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		String S = scanner.nextLine();
		String T = scanner.nextLine();
		String a = scanner.nextLine();
		String b = scanner.nextLine();
		String U = scanner.nextLine();
		int A = Integer.parseInt(a);
		int B = Integer.parseInt(b);

		System.out.println(S);

//		System.out.println(U.equals(S)?A-1:B-1);
		if (U.equals(S)) {
			System.out.println(A-1);
		} else if (U.equals(T)){
			System.out.println(B-1);
		}

	}

}
