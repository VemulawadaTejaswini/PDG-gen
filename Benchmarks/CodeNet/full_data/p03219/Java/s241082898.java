import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		//スペース区切りの整数入力
		int b = sc.nextInt();
		System.out.println(a + b/2);
	}

}