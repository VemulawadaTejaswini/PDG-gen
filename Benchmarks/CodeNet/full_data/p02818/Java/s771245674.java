
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		long k = sc.nextLong();
		
		if(k >= a) {
			System.out.println(0+" "+ (b-(k-a)));
		}
		else {
			System.out.println((a-k)+" "+b);
		}
	}

}
