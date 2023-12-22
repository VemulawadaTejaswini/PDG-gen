import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		String t = "CODEFESTIVAL2016";
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int c = 0;
		for (int i = 0; i < 16; i++) {
			if (s.charAt(i) != t.charAt(i)) {
				c++;
			}
		}
		System.out.println(c);
	}
}
