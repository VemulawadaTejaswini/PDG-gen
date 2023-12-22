import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		int[] S = new int[s.length()];
		
		for(int i = 0; i < s.length(); i++) {
			S[i] = s.charAt(i);
		}
		
		Arrays.sort(S);
		int check = 0;
		
		for(int i = 0; i < S.length - 1; i++) {
			if(S[i] >= S[i + 1] - 1) {
				continue;
			} else {
				System.out.println((char)(S[i] + 1));
				check++;
				break;
			}
		}
		if(check == 0) {
			System.out.println("None");
		}
	}
}
