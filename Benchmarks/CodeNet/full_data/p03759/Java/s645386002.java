import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		a = b - a;
		c -= b;
		
		if(a == c)System.out.println("YES");
		else System.out.println("NO");
		sc.close();
	}

}
