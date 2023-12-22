import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			float w = sc.nextInt();
			float h = sc.nextInt();
			float x = sc.nextInt();
			float y = sc.nextInt();
			
			float area = w * h / 2;
			boolean check = false;
			
			if (w / 2 == x && h / 2 == y) {
				check = true;
			}
			
			if (check) {
				System.out.println(area + " " + 1);
			} else {
				System.out.println(area + " " + 0);
			}
		}

	}

}
