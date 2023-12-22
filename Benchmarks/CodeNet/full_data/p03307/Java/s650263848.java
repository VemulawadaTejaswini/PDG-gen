
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i = 0;N % 2 == 0;i++) {
				N = N / 2;
		}
		N = N * 2;
		System.out.println(N);
	}
}