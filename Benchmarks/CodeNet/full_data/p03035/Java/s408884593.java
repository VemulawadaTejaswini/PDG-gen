import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		if(a<=5) System.out.println("0");
		else if(a>=6 && a<=12) System.out.println(b/2);
		else System.out.println(b);
	}

}
