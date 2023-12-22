import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int input = new Scanner(System.in).nextInt();
		System.out.println(input/100 == input%10?"Yes":"No");
	}

}