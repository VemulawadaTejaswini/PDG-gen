import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String t = scn.next();
		int f = Integer.valueOf(t.substring(0, 2));
		int e = Integer.valueOf(t.substring(2, 4));
		if(f<=12&&f!=0) {
			if(e<=12&&e!=0) {
				System.out.println("AMBIGUOUS");
			}else {
				System.out.println("MMYY");
			}
		}else {
			if(e<=12&&e!=0) {
				System.out.println("YYMM");
			}else {
				System.out.println("NA");
			}
		}
		scn.close();
	}
}