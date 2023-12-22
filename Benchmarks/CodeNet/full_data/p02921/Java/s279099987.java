import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner ipt = new Scanner(System.in);
		//1
		String n = ipt.next();
		String[] alpha = null;
		String[] alpha2 = null;
		int ans = 0;
		alpha = n.split("");
		Arrays.sort(alpha, Comparator.reverseOrder());
		//2
		n = ipt.next();
		alpha2 = n.split("");
		Arrays.sort(alpha2, Comparator.reverseOrder());
		for (int i = 0; i < alpha.length; i++)
			if (alpha[i].equals(alpha2[i]))
				ans++;
		System.out.println(ans);
		ipt.close();
	}
}