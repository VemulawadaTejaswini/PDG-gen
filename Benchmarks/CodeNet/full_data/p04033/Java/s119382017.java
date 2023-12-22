import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a <= 0 && 0 <= b) {
			System.out.println("Zero");
		}else if(a > 0) {
			System.out.println("Positive");
		}else{
			int negative = b - a + 1;
			System.out.println(negative % 2 == 0 ? "Positive" : "Negative");
		}
	}

}
