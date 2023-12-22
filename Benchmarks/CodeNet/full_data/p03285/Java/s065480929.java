import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int c = n/4;
		int d = n/7;
		
		for(int i=0; i<=c; i++) {
			for(int j=0; j<=d; j++) {
				if(4*i + 7*j == n) {
					System.out.println("Yes");
					return;
				}
			}
		}
		
		System.out.println("No");
	}

}