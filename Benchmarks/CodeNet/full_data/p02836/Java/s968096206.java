import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		String S = stdIn.next();
		int sum = S.length()/2;
		int k = S.length();
		int ans = 0;
		for(int i = 0; i < sum; i++){
			k--;
			if(S.charAt(i) != S.charAt(k)){
				ans++;
			}
		}
		System.out.println(ans);
		stdIn.close();
	}
}
