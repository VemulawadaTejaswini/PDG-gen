import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		if(a>12)System.out.println(b);
		else if(a>=6)System.out.println(b/2);
		else System.out.println("0");
	}
}