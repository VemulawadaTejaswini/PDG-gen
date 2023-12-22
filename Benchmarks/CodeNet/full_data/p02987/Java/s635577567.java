import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char[] S = (sc.next()).toCharArray();
		Arrays.sort(S);
		if(S[0] == S[1] && S[2] == S[3] && S[1] != S[2]) System.out.println("Yes");
		else System.out.println("No");
	}
}