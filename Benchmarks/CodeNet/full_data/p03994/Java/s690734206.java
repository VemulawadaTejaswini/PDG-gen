import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String o = scan.nextLine();
		int ops = Integer.parseInt(o);
		char[] c = s.toCharArray();
		int[] chartoint = new int[c.length];
		for (int i = 0; i < c.length; i++) {
			int value = Character.getNumericValue(c[i]);
			chartoint[i] = value;
		}
		Arrays.sort(chartoint);
		int nomore = 1;
		while (nomore != 0 ) {
			for (int i = c.length-1; i >= 0; i--) {
				if (chartoint[i] != 10) {
					if (chartoint[i] + ops >= 36) {
						ops = ops - (35-chartoint[i]+1);
						System.out.println(ops);
						chartoint[i] = 10;
						Arrays.sort(chartoint);
					}
				}
				if (chartoint[c.length-1]+ops < 36) {
					nomore = 0;
				}
			}
		}
		while ( ops > 0 ) {
			chartoint[chartoint.length-1] = chartoint[chartoint.length-1]+1;
			ops--;
		}
		String[] inttochar = new String[chartoint.length]; 
		for (int i = 0; i < chartoint.length; i++) {
			inttochar[i] = Character.toString(Character.forDigit(chartoint[i], 36));	
		}
		System.out.println(String.join("", inttochar));
		String rand = "aaaafeaaivap";
		System.out.println(rand.compareTo("aaaaaaadeioy"));
	}
}