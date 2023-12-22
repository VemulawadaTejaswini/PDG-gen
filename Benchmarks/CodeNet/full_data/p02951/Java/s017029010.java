import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int A;
		int B;
		int C;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Aの数値を入力してください");
			A = Integer.parseInt(sc.next());
			System.out.println("Bの数値を入力してください");
			B = Integer.parseInt(sc.next());
			System.out.println("Cの数値を入力してください");
			C = Integer.parseInt(sc.next());
			if(A < B) {
				System.out.println("入力に誤りがあります");
				System.out.println("もう1度最初からやり直してください");
				continue;
			} else {
				break;
			}
		}
		if (A >= B+C) {
			C = 0;
		} else {
			C = B+C-A;
		}
		System.out.println("容器2の残りは" + C + "リットルです");
	}		

}
