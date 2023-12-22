import java.util.Scanner;

public class Main {
	
	public void slove() {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int k = input.nextInt();
		
		for (int i = a; i <= Math.min(b, a+k-1); i++) {
			System.out.println(i);
		}
		
		for (int i = Math.max(b-k+1, a+k); i <= b; i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		new Main().slove();
	}

}
