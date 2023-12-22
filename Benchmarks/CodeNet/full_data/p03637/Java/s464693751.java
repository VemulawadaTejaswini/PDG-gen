import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int c4 = 0;
		int codd = 0;
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(sc.next());
			if (a % 4 == 0)
				c4++;
			else if (a % 2 != 0)
				codd++;
		}
		if (c4 >= codd || c4 + codd == n && codd - c4 == 1)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}