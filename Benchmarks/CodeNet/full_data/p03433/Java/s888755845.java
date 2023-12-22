import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int A = in.nextInt();
		
		int buy = N % 500;
		if(buy<A) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
