
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		
		String s1 = "";
		String s2 = "";
		
		for(int i = 0 ; i < w ; i++) {
			if(a > i) {
				s1 += "1";
				s2 += "0";
			}
			else {
				s1 += "0";
				s2 += "1";
			}
		}
		
		
		for(int i = 0 ; i < h ;i++) {
			if(i < b) {
				System.out.println(s1);
			}
			else {
				System.out.println(s2);
			}
		}
		
	}
}

