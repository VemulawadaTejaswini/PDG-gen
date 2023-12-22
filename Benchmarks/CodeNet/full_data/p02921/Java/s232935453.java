import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int weatherCountOk = 0;
		for(int i = 0; s.length() < i ; i++) {
			if(s.substring(i, i+1).equals(t.substring(i, i+1))) {
				weatherCountOk++;
			}
		}
		System.out.println(weatherCountOk);
		sc.close();

	}
}
