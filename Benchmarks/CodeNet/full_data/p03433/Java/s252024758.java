import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = scan.nextInt();
		scan.close();
		while(a>=500) {
			a-=500;
		}
		System.out.println((n>=a)? "Yes":"No");

	}

}