import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String ans = "Good" ;
		int [] str = new int [3] ;

		for (int i = 0;i < 4;i++) {
			str[i] = scan.nextInt() ;
		}

		if (str[0] == str[1]) {
			ans = "Bad";
		} else if (str[1] == str[2]) {
			ans = "Bad";
		} else if (str[2] == str[3]) {
			ans = "Bad";
		}
		System.out.println(ans);
	}
}