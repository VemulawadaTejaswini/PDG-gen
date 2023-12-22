import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		char[] acgt = sc.next().toCharArray();
		int[] count = new int[n];

		for (int i = 1; i < n - 1; i++) {
			if (acgt[i - 1] == 'A' && acgt[i] == 'C') {
				count[i]++;
			}
			count[i + 1] = count[i];
		}

		String rslt = "";
		for (int j = 0; j < q; j++) {
			int l = sc.nextInt() - 1;
			int r = sc.nextInt() - 1;
			rslt += (count[r] - count[l]) + "\n";
		}
		System.out.println(rslt);
		sc.close();
	}
}
