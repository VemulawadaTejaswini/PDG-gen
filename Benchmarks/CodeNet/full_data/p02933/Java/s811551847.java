import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		String s = sc.next();
		System.out.println((n >= 3200) ? s : "red");
	}
}
