import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String C = sc.next();
		sc.close();

		String a="abcdefghijklmnopqrstuvwxyz";
		int num=a.indexOf(C);
		char b=a.charAt(num+1);

		System.out.println(b);
	}
}
