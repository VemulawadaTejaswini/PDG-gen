import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int N = sc.nextInt();
			if(N <= 9) {
				System.out.println("Yes");
				return;
			}
			if(N <= 81) {
				for(int i = 2; i <= 9; i++) {
					if(N % i == 0 && (N / i) < 10) {
						System.out.println("Yes");
						return;
					}
				}
			}
			System.out.println("No");
		}
	}
}