import java.util.Scanner;

public class Main {

	public static void main(String... nui) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		if (h == 1 || w == 1) {
			System.out.println(1);
			return;
		}
		
		System.out.println((h % 2 != 0 && w % 2 != 0) ? h * w / 2 + 1 : h * w / 2);
		
	}

}
