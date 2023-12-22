import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt(); 
		int[] digits = new int[10];
		
		for (int i = 0; i < k; i++)
			digits[in.nextInt()] = 1;
		
		int start = n;
	
		while (!solve(start, digits)) {
			start++;
		}
		
		System.out.println(start);
	}
	
	public static boolean solve(int s, int[] digits) {
		while (s > 0) {
			if (digits[s % 10] == 1)
				return false;
			s /= 10;
		}
		return true;
	}
}
