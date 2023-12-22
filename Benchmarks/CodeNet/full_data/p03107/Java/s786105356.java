import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		int ans = 0;
		for(int i = 0;i<S.length();i++){
			if(S.charAt(i) == '1'){
				ans += 1;
			}else{
				ans -= 1;
			}
		}
		System.out.println(S.length() - Math.abs(ans));
	}
}
