import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int k = sc.nextInt();
			int x = sc.nextInt();
			
			for(int i = x - k + 1 ; i <= x + k - 1; i++ ) {
				System.out.println(i);
			}
			
			
			
		}
	}
}
