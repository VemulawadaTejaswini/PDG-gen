import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] S = sc.next().toCharArray();
		sc.close();
		Arrays.sort(S);
		if(S[0] == S[3]) System.out.println("No");
		else if(S[0] == S[1] && S[2] == S[3]) System.out.println("Yes");
		else System.out.println("No");
	}
}