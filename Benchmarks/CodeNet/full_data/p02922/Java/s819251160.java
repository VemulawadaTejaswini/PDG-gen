import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		System.out.println(a!=b?(a==2?b:(b/a+1)):(b/a));
	}
}
