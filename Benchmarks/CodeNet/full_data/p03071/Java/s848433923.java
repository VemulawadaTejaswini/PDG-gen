import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		String InStr = scan.nextLine();
		String[] AryStr = InStr.split(" ");

		int A;
		int B;

		A = Integer.parseInt(AryStr[0]);
		B = Integer.parseInt(AryStr[1]);

		if (A < B) {
			A = B--;
        } else if (A > B) {
            B = A--;
        }
                   
        System.out.println(A + B);
	}
}
