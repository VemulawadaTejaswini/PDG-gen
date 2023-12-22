import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x = 0, y = 0, sum = 0;
		for(int i = 0 ; i < N ; i++) {
			x += 800;
			y += 200;
		}
		sum = x - y;
		System.out.println(sum);
	}
}
