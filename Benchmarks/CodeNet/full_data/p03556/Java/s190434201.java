import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(long i = 1; i <= N; i++) {
			if(i * i > N) {
				System.out.println((i - 1) * (i - 1));
				break;
			}	
		}
	}
}
