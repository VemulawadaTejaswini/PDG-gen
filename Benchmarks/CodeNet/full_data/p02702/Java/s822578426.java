import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		String S = stdIn.nextLine();
		long ans = 0;
		for(int i = 0; i < S.length() - 3; i ++) {
			if(S.charAt(i) == '0') {
				continue;
			}
			for(int j = i + 3; j < S.length(); j ++) {
				if(Double.parseDouble(S.substring(i, j + 1)) % 2019 == 0) {
					ans ++;
				}
			}
		}
		System.out.println(ans);
	}
}