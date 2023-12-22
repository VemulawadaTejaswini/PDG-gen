import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		int diff = b - a;
		int height = 0;
		for(int cnt = 1; cnt <= diff ; cnt++){
			height = height + cnt;
		}
		System.out.println(height-b);
	}
}
