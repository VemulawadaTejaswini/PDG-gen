import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num == 3 || num == 5 || num == 7 ) System.out.println("YES");
		else System.out.println("NO");

	}
}
