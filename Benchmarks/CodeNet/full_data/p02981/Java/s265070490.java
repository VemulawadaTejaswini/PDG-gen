
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		int train = a * n;
		int taxi = b;
		
		if(train < taxi) {
			System.out.println(train);
		} else {
			System.out.println(taxi);
		}
		
		sc.close();
	}

}