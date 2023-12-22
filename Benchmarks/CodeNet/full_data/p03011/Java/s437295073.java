import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int [] list = new int [3] ;

		for (int i = 0; i < 3; i++) {
			list[i] = scan.nextInt() ;
		}

		int result = 101 ;

		for(int j = 0;j < 3; j++) {
			if (list[j] < result ) {
				result = list[j] ;
			}
		}

		for(int j = 0;j < 3; j++) {
			if (list[j] == result ) {
				list[j] = 101;
				break;
			}
		}
		int result2 = 101 ;

		for(int j = 0;j < 3; j++) {
			if (list[j] < result2 ) {
				result2 = list[j] ;
			}
		}

		for(int j = 0;j < 3; j++) {
			if (list[j] == result2 ) {
				list[j] = 101;
				break;
			}
		}

		System.out.println(result + result2);
	}
}