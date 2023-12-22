import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		
		for (int i = 9 ; i >= 1 ; i--) {
			if (N % i == 0) {
				N = N / i;
				break;
			}
		}
		
		if (1 <= N && N <= 9) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
