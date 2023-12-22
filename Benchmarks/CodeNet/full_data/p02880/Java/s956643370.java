import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		
		for(int i = 2; i <= 9; i++) {
			if(n%i == 0) {
				int a = n/i;
				
				if(a<10) {
					System.out.println("Yes");
					System.exit(0);
				}
			}
		}
		System.out.println("No");		
	}

}
