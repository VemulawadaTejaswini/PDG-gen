import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		//int s = sc.nextInt();

		int t = s.indexOf("A");
		int e = s.indexOf("Z");
		int n = e - t;
		System.out.println(n);
	}
}