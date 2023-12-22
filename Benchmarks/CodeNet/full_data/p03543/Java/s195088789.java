import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Ns = sc.next();
		char[] N = Ns.toCharArray();
		
		Arrays.sort(N);
		int count = 1;
		
		for(int i = 0; i < 3; i++) {
			if(N[i] == N[i + 1]) {
				count++;
			}
		}
		
		if(count >= 3) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
