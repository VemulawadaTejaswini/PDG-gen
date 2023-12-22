import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] tmpList = line.split(" ", 0);
		int m = Integer.parseInt(tmpList[0]);
		int n = Integer.parseInt(tmpList[1]);

		if(m == n) {
			System.out.print("Yes");
		} else {
			System.out.print("No");
		}
	}
}