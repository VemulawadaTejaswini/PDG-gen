import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String N2 = Integer.toBinaryString(N);
		int plus = 0;

		int l = N2.length();


			for(int i=0; i<l/2; i++) {
				if(Character.getNumericValue(N2.charAt(l-2-2*i)) == 1) {
					plus += Math.pow(2, 2*i+2);
				}
			}

		N += plus;

		N2 = Integer.toBinaryString(N);
		System.out.println(N2);

	}

}
