import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String input = scn.nextLine();
		int a = Integer.valueOf(input.split(" ")[0]).intValue();
		int b = Integer.valueOf(input.split(" ")[1]).intValue();
		int N = 2;
		int myCoins = 0;

		for(int i = 0;i < N;i++) {
			if(a == b) {
				myCoins += a;
				a--;
			}
			else if(a > b) {
				myCoins += a;
				a--;
			}
			else {
				myCoins += b;
				b--;
			}
		}

		System.out.println(myCoins);
	}
}
