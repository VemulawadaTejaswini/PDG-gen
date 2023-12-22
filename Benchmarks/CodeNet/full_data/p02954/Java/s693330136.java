
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

		// Rを拾う
		int odd = 0;
		int even = 0;
		for(int i = 0 ; i < s.length() ; i++) {
			if(s.charAt(i) == 'R') {
				if(i % 2 == 0) {
					even++;
				} else {
					odd++;
				}
			} else {
				if(i % 2 == 0) {
					ret[i] += even;
					ret[i-1] += odd;
				} else {
					ret[i] += odd;
					ret[i-1] += even;
				}
				odd = 0;
				even = 0;
			}
		}

		odd = 0;
		even = 0;
		for(int i = s.length() - 1 ; i >= 0 ; i--) {
			if(s.charAt(i) == 'L') {
				if(i % 2 == 0) {
					even++;
				} else {
					odd++;
				}
			} else {
				if(i % 2 == 0) {
					ret[i] += even;
					ret[i+1] += odd;
				} else {
					ret[i] += odd;
					ret[i+1] += even;
				}
				odd = 0;
				even = 0;
			}
		}

		for(int i = 0 ; i < ret.length ; i++) {

			if(i == ret.length - 1) {
				System.out.print(ret[i]);
			} else {
				System.out.print(ret[i] + " ");
			}

		}

		sc.close();

	}

}
