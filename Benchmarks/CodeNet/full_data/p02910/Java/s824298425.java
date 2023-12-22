import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		for(int i=0; i<S.length(); i++) {
			boolean a = true;
			if((i+1)%2 ==0) {
				a = even(S.substring(i,i+1));
			} else {
				a = odd(S.substring(i,i+1));
			}
			if(!a) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
	private static boolean odd(String a) {
		switch(a) {
		case "R":
		case "U":
		case "D":
			return true;
		default :
			return false;
		}
	}
	private static boolean even(String a) {
		switch(a) {
		case "L":
		case "U":
		case "D":
			return true;
		default :
			return false;
		}
	}
}