import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] c = s.toCharArray();
		String res = "yes";
		for (int i=0; i<s.length(); i++) {
			for (int j=i+1; j<s.length(); j++) {
				if ( c[i] == c[j] ) res = "no";
			}			
		}
		System.out.println(res);
	}
}