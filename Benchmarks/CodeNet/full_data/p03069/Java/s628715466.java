import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String line = sc.nextLine();

		int black = 0;
		int whiteInRBlack = 0;

		for (int i = 0; i < n; i++) {
			if (line.charAt(i) == '#')
				black++;
			if (black > 0 && line.charAt(i) == '.')
				whiteInRBlack++;
		}

		if (black < whiteInRBlack)
			System.out.println(black);
		else
			System.out.println(whiteInRBlack);
		sc.close();
	}
}
