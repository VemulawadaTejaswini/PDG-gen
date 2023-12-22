import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int l = sc.nextInt();
		
		String[] input = new String[n];
		
		for (int i=0; i<n; i++) {
			input[i] = sc.next();
		}
		
		Arrays.sort(input);
		
		System.out.println(input[0] + input[1] + input[2]);
		sc.close();
	}

}