import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int a,b;

		Scanner sc =  new Scanner(System.in);

		a = sc.nextInt();
		b = sc.nextInt();

		int ab1,ab2,ab3;

		ab1 = a + b;
		ab2 = a - b;
		ab3 = a*b;

		int max = ab1;

		if (ab2 > max) max = ab2;
		if (ab3 > max) max = ab3;

		System.out.println(max);
	}
}
