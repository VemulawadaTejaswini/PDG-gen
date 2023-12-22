import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(check(s)) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
	}

	private static boolean check(String s) {
		char odd = 'L';
		char even = 'R';
		for(int i = 1; i < s.length() + 1; i++) {
			char tmp = s.charAt(i - 1);
			if( i % 2 == 0) {
				if(tmp == even) {
					return false;
				}
			} else {
				if(tmp == odd) {
					return false;
				}
			}
		}
		return true;
	}
}