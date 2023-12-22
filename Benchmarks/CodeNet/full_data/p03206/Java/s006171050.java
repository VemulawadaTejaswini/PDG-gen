import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num == 25) System.out.println("Christmas");
		else if(num == 24) System.out.println("Christmas Eve");
		else if(num == 23) System.out.println("Christmas Eve Eve");
		else if(num == 22) System.out.println("Christmas Eve Eve Eve");
	}
}
