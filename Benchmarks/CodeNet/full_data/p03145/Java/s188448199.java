import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		
		final int AB = sc.nextInt();
		final int BC = sc.nextInt();
		final int AC = sc.nextInt();
		
		final int area = AB * BC / 2;
		
		System.out.println(area);
	}

}
