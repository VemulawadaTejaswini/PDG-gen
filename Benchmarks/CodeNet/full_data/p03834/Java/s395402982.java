import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = a.replaceAll(",", " ");
		System.out.println(b);
	}
}
