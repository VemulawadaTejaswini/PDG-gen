import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		String str = stdIn.next();
		String[] acgtArray = str.split("[^ACGT]");
		stdIn.close();

		int max = 0;
		for (String acgt : acgtArray) {
			int len = acgt.length();
			if(max < len) {
				max = len;
			}
		}

		System.out.println(max);
	}
}
