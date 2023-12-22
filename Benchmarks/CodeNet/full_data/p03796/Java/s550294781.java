import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int exercise = sc.nextInt();
		
		int power = 1;
		
		for (int i = 1; i <= exercise; i++) {
			power = (power * i) % (((int) Math.pow(10, 9)) + 7);
		}
		
		System.out.println(power);
	}
}
