import java.util.Scanner;

public class Main {



	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	// 入力

	int n = sca.nextInt();
	int m = sca.nextInt();

	if(n == m) {
		System.out.println("Yes");
	}
	else {
		System.out.println("No");
	}

	// 後始末
	sca.close();
	}
}