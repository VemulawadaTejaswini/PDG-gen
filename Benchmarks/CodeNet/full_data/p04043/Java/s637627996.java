import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int seven = 0;
		int five = 0;
		while (sc.hasNext()) {
			int num = sc.nextInt();
			if (num == 7) {
				seven++;
			} else if (num == 5) {
				five++;
			}
		}
		if (seven == 1 && five == 2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}
}