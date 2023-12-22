
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		boolean ok = true;
		if (st.charAt(0)!='A') ok = false;
		int count=0;
		for (int i=2;i<st.length()-1;i++)
			if (st.charAt(i)=='C') count++;
		if (count!=1) {
			ok = false;
		}
		
		for (int i=1;i<st.length();i++)
			if (st.charAt(i)!='C' && st.charAt(i)!=st.toLowerCase().charAt(i)) {
				ok = false;
			}
		
		if (ok) System.out.println("AC");
		else System.out.println("WA");

	}
}
