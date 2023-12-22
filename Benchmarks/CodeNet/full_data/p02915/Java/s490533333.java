import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int user = input.nextInt();
		user  = (user*user*user);
		System.out.println(user);
	}
}
