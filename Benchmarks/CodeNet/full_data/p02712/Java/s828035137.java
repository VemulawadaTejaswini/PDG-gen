

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long ans = 0;
		ArrayList<Integer>array = new ArrayList<Integer>();

		for(int i=1 ; i<=n ; i++) {
			if( (i % 3 != 0) && (i % 5 != 0) ) {
				array.add(i);
			}
		}

		for(int i=0 ; i<array.size() ; i++) {
			ans += array.get(i);
		}

		System.out.println(ans);

		sc.close();


	}

}
