import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String si[] = new String[n];
		String qi[] = new String[n];
		String ri[] = new String[n];
		int i;
		int pi[] = new int[n];
		int aa, ab, wa;
		String w;

		for (i = 0; i < n; i++) {
			si[i] = s.next();
			pi[i] = s.nextInt();
			qi[i] = si[i] + pi[i];
			ri[i] = qi[i];
		}

		Arrays.sort(qi);
		Arrays.sort(si);

		for (int m = 0; m < qi.length - 1; m++) {
			for (int j = 0; j < qi.length - 1; j++) {

				if (si[j].equals(si[j + 1])) {//文字だけの比較
					aa = Integer.parseInt(qi[j].replaceAll("[^0-9]", ""));//数値だけの比較
					ab = Integer.parseInt(qi[j + 1].replaceAll("[^0-9]", ""));
					if (aa < ab) {
						w = qi[j];
						qi[j] = qi[j + 1];
						qi[j + 1] = w;

						w = si[j];
						si[j] = si[j + 1];
						si[j + 1] = w;
					}
				}
			}
		}

		for (int l = 0; l < qi.length; l++)
			for (int k = 0; k < qi.length; k++) {
				if (ri[k].equals(qi[l])) {
					System.out.println(k + 1);
				}
			}
	}
}
