import java.io.InputStreamReader;
import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		

	Scanner sc = new Scanner(new InputStreamReader(System.in));
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	if (a + b >= c) {
		System.out.println("Yes");
	}else {
		System.out.println("No");
	}

	}
}