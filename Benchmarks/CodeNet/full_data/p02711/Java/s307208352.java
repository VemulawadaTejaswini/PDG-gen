import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		boolean b = a -700 == a%100 
				||  a%100 - 70 == a % 10
				||  a%10 -7 == 0;
		if (b) System.out.println("Yes");
		else System.out.println("No");
	}
}
