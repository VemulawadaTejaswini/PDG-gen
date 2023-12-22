import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);//Scanner型の変数sにインスタンス化したメソッドを代入
		int A = s.nextInt();
		int B = s.nextInt();
		String op = s.next();
		
		if (op.equals("+")) {
			System.out.println(A + B);
		} else if (op.equals("-")) {
			System.out.println(A - B);
		}
	}

}
