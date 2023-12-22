
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		int[] ret = new int[s.length()];
		for(int i = 0 ; i < ret.length ; i++) {

			ret[i] = 0;

		}

		int loop = 10000;
		for(int i = 0 ; i < s.length() ; i++) {

			int currentIndex = i;
			for(int j = 0 ; j < loop ; j++) {

				if(s.charAt(currentIndex) == 'L') {

					currentIndex--;

				} else {

					currentIndex++;

				}

			}
			ret[currentIndex]++;

		}

		for(int r : ret) {

			System.out.print(r + " ");

		}

		sc.close();

	}

}
