import java.util.Scanner;

public class Main {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		boolean f1 = false;
		boolean f7 = false;
		boolean f9 = false;
		boolean f4 = false;

		for ( int i = 0; i < 4; i ++) {
			int test = sc.nextInt();
			if ( test == 1) {
				f1 = true;
			}
			if ( test == 7) {
				f7 = true;
			}
			if ( test == 9) {
				f9 = true;
			}
			if ( test == 4) {
				f4 = true;
			}
		}

		if ( f1 && f7 && f9 && f4) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
