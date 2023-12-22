import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	 	Scanner scanner = new Scanner(System.in);
	 	int x = scanner.nextInt();
	 	int y = 0;
	 	int z = 0;
	 	y = x / 500;
	 	x = x % 500;
	 	z = x / 5;
	 	System.out.println(y*1000+z*5);
	}
}
