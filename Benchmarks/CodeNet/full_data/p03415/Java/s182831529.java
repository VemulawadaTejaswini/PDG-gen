import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		String str3 = sc.nextLine();
		System.out.println(str1.substring(0, 1) + str2.substring(1, 2) + str3.substring(2));
		sc.close();

	}
