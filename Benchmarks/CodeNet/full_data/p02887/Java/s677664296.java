import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int N = sc.nextInt();
			char[] S = sc.next().toCharArray();
			int c = 0;
			char prev = 'A';
			for(int i = 0; i < N; i++) {
				if(S[i] != prev) {
					c++;
					prev = S[i];
				}
			}
			System.out.println(c);
		}
	}
}
