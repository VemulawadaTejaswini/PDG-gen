import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		String S = "";
		
		for(int i = 0; i < s.length(); i++) {
			 if(i % 2 == 0) {
				 String x = String.valueOf(s.charAt(i));
				 S += x;
			 }
		}
		System.out.println(S);
	}
}
