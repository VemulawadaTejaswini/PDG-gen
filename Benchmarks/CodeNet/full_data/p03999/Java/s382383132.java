import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long n = scan.nextLong();

		String nString = String.valueOf(n);
		String[] nStringArray = new String[nString.length()];

		for (int i = 0; i < nString.length(); i++) {
		    nStringArray[i] = String.valueOf(nString.charAt(i));
		}

		scan.close();

		long sumAll = 0;
		for(int bit = 0; bit < (1 << nString.length() - 1); bit++) {
			long sum = 0;
			String numString = "";
			for(int i = 0; i < nString.length(); i++) {
				if((bit & (1<<i)) != 0) {
					if(numString == "") {
						sum += Integer.valueOf(nStringArray[i]);
						continue;
					}
					numString = numString + nStringArray[i];
					sum += Integer.valueOf(numString);
					numString = "";
				}else {
					numString = numString + nStringArray[i];
				}
			}
			sum += Long.valueOf(numString);

			sumAll += sum;
		}
		System.out.println(sumAll);
	}

}