import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		if(N.length() == 1) {
			System.out.println(N);
		}else if(N.substring(1).matches("9+")) {
			System.out.println((N.charAt(0) - '0' ) + (N.length() - 1) * 9);
		}else {
			System.out.println((N.charAt(0) - '0' - 1) + (N.length() - 1) * 9);
		}
	}
}