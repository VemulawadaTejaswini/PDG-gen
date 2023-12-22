import java.util.Scanner;

public class Restricted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		a = a + b;
		if(a >= 10)System.out.print("error");
		else System.out.print(a);
	}
}