package test_java_project;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		if (a <= b) System.out.println("Yes");
		else System.out.println("No");

	}
}