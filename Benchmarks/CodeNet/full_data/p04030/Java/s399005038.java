import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		char[] c = new char[12];
		for (int i = 0; i < s.length(); i++) {
			c[i] = s.charAt(i);
			}
		for (int i = 0; i < s.length(); i++) {
			if (c[i+1] != 'B' &&  c[i] == '0') {
				System.out.print("0");
				}
			if (c[i+1] != 'B' &&  c[i] == '1') {
				System.out.print("1");
			}
			}
		}
}