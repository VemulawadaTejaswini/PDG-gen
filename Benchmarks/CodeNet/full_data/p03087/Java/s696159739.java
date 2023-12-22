import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String acgt = sc.nextLine();
		acgt = sc.nextLine();

		while (sc.hasNext()) {
			String[] lr = sc.nextLine().split(" ");
			int l = Integer.parseInt(lr[0]);
			int r = Integer.parseInt(lr[1]);
			String substr = acgt.substring(l - 1, r);
			coreProc(substr.toCharArray());
		}
		sc.close();
	}

	private static void coreProc(char[] cArray) {
		int numAc = 0;

		for (int i=0,k = 0; i < cArray.length -1; i++) {
			if (cArray[i] != 'A') {
				continue;
			}
			if (cArray[++i] == 'C') {
				numAc++;
			}
		}
		System.out.println(numAc);
	}
}
