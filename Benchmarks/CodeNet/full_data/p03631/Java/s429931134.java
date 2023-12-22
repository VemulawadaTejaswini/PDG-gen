import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int input = new Scanner(System.in).nextInt();
		if(input/100 == input%10) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}