import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String ans = s.contains("A") && s.contains("B") ? "Yes" : "No";
		System.out.println(ans);
		sc.close();
	}

}
