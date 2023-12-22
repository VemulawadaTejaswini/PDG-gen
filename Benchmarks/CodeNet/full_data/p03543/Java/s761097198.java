import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		char[] n = sc.next().toCharArray();
		if ((n[0] == n[1] && n[0] == n[2]) || (n[0] == n[1] && n[0] == n[3]) || (n[0] == n[2] && n[0] == n[3])
				|| (n[1] == n[2] && n[1] == n[3]))
			System.out.println("Yes");
		else
			System.out.println("No");
		sc.close();
	}
}