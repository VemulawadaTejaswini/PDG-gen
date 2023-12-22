import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		String S = stdIn.next();
		int sum = S.length();
		int ans[] = new int[sum];
		for(int i = 0; i < sum; i++){
			ans[i] = (S.charAt(i) - 65 + N) % 26 + 65;
			System.out.print((char)ans[i]);
		}
		System.out.println();
		stdIn.close();
	}
}
