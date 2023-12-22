
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int n = sc.nextInt();
		int nn = n;
		while(n != 0) {
			sum += n%10;
			n = n/10;
		}
		if(nn%sum == 0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}
