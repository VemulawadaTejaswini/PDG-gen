import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String t = sc.next();

		char[] sch = s.toCharArray();
		Arrays.sort(sch);
		s = new String(sch);

		char[] tc = t.toCharArray();
		Arrays.sort(tc);
		for(int i=0; i< tc.length/2 -1;i--) {
			char ctmp = tc[i];
			tc[i] = tc[tc.length-1-i] ;
			tc[tc.length-1-i] = ctmp;
		}
		t = new String(tc);

		if(s.compareTo(t)<0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}