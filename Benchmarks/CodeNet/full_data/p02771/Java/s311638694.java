import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		String ans = "No";

		if(A == B && B != C)
			ans = "Yes";
		if(A == C && A != B)
			ans = "Yes";
		if(B == C && A != B)
			ans = "Yes";

		System.out.println(ans);
	}

}
