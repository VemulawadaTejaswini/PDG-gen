
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			System.out.println(Ryuka(n));
		}
	}
	static int Ryuka(int n) {
		if(n == 0) return 2;
		else if(n == 1) return 1;
		else return Ryuka(n-1)+Ryuka(n-2);
	}
}

