import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int count = 0;
		int[] c = new int[5];
		for (int i = a; i <= b; i++) {
			int j = i;
			int x = 0;
			while (j > 0) {
				c[x] = j % 10;
				j = j/10;
              	x++;
			}
			if (c[0] == c[4] && c[1] == c[3]) {
				count++;
			}
		}
		System.out.println(count);
	}
}
