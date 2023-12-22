import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] S = sc.nextLine().toCharArray();
		
		for (int i = 1; i < S.length; i++) {
			for (int j = i; j < S.length; j++) {
				if(S[i-1] == S[j]) {
					System.out.println("no");
					return;
				}
			}
		}
		
		System.out.println("yes");
		
	}
}



