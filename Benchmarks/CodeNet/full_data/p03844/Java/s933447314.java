import java.util.Scanner;
public class Answer {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);//Scanner型の変数sにインスタンス化したメソッドを代入
		int A = s.nextInt();
		int B = s.nextInt();
		boolean op = true;
		
		if (op) {
			System.out.println(A + B);
		} else {
			System.out.println(A - B);
		}
		s.close();
		

	}

}

