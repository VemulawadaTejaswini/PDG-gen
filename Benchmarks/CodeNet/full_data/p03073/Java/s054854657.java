import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] c = s.toCharArray();
		char[] start_black = new char[s.length()];
		char[] start_white = new char[s.length()];
		int bCount = 0;
		int wCount = 0;
		for(int i = 0; i <s.length(); i++) {
			if(i%2==0) {
				start_black[i] = '0';
				start_white[i] = '1';
			}
			else {
				start_black[i] = '1';
				start_white[i] ='0';
			}
		}
		for(int i = 0; i < s.length(); i++) {
			if(c[i] != start_black[i]) {
				bCount++;
			}
			if(c[i] != start_white[i]) {
				wCount++;
			}
		}
		System.out.println(Math.min(wCount, bCount));
	}
}
