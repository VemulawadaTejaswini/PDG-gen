import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String result = " ";

		Integer [] a = new Integer[2] ;
		for(int i =0; i < 3; i++) {
			a[i] = scan.nextInt();
		}

		Arrays.sort(a[2]) ;

		if (a[2] == a[1] + a[0]) {
			result = "Yes" ;
		} else {
			result = "No" ;
		}

        System.out.println(result);
	}
}