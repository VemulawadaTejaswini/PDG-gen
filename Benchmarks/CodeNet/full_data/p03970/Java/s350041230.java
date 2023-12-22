import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String s = "CODEFESTIVAL2016";
		Scanner sc = new Scanner(System.in);
		String t = sc.next();
		int count = 0;
		for(int i=0;i<s.length();i++) {
			if (s.charAt(i) != t.charAt(i)) {
				count++;
			}
		}
		System.out.println(count);
	}

}
