import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		String S = stdIn.nextLine();
		long ans = 0;
		long digitSum = 0;
		for(int i = 0; i < S.length(); i ++) {
			digitSum = (int)S.charAt(i) - 48;
			for(int j = i + 1; j < S.length(); j ++) {
				digitSum += (int)S.charAt(j) - 48;
				if(digitSum % 3 != 0) {
					continue;
				}
				if(Double.parseDouble(S.substring(i, j + 1)) % 2019 == 0) {
					ans ++;
				}
			}
		}
		System.out.println(ans);
	}
}