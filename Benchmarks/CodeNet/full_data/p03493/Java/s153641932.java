
import java.util.Scanner;

public class Mazin {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		int count=0;
		for(int i=0;i<a.length();i++) {
			char charAt = a.charAt(i);
			if(charAt=='1') {
				count++;
			}
		}
		System.out.println(count);
	}
}