import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n[] = sc.next().split("");
		System.out.println((n[0].equals(n[2]))? "Yes" : "No");
	}
}