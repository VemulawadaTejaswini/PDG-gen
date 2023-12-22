import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		char c=scan.next().charAt(0);
		int b=scan.nextInt();
		if(c=='+') System.out.println(a+b);
		else System.out.println(a-b);
	}

}
