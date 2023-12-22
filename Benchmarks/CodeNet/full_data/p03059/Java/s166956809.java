import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int T = sc.nextInt();
		int x = A;
		int y = 0;
		
		while(T + 0.5 > x){
			x += A;
			y += B;
		}
		System.out.println(y);
	}
}
