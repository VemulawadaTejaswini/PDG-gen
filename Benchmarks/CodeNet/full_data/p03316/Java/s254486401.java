import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		partB101();
	}


	public static void partB101() {
		Scanner scB = new Scanner(System.in);
		String N = scB.nextLine();
		int M = Integer.parseInt(N);
		int S = 0;

		for(int i = 0 ; i < N.length() ; i++) {
			S += Character.getNumericValue(N.charAt(i));
		}
    

		if(M % S == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}