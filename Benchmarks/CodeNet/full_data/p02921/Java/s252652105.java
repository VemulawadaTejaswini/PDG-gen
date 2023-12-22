import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		String S = stdIn.next();
		String T = stdIn.next();
		int ans = 0;
		for(int i = 0; i < S.length(); i++){
			if(S.charAt(i) == T.charAt(i)){
				ans++;
			}
		}
		System.out.println(ans);
		stdIn.close();
	}
}