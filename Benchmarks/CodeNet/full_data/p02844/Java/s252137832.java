import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String S = scan.next();
		HashMap<String, Integer> PIN = new HashMap<String, Integer>();
		int ans = 0;

		for(int i = 0; i < N; i++){

			for(int j = i+1; j < N-1; j++){

				for(int k =j+1 ; k < N; k++){

					/*
					if(PIN.get( S.substring(i, i+1).concat(S.substring(j, j+1)).concat(String.valueOf(S.charAt(k)))) != 1) {
						ans += 1;
						PIN.put( S.substring(i, i+1).concat(S.substring(j, j+1)).concat(String.valueOf(S.charAt(k))), 1);
					}else {
						continue;
					}
					*/

					if(PIN.containsKey( String.valueOf(S.charAt(i)).concat(String.valueOf(S.charAt(j))).concat(String.valueOf(S.charAt(k)))) == false) {
						ans += 1;
						PIN.put( String.valueOf(S.charAt(i)).concat(String.valueOf(S.charAt(j))).concat(String.valueOf(S.charAt(k))), 1);
					}else {
						continue;
					}


				}

			}

		}

		System.out.println(ans);

		/*
		int total = 0;

		total = factorial(S.length()) / (factorial(3) * factorial(S.length()-3));
		*/

		scan.close();

	}
}
