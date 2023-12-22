import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int l = kb.nextInt();
		int k1 = 1;
		int k2 = 1;
		int k3 = l - 2;
		int sum = k1 * k2 * k3;
		//System.out.println(sum);
		while (k1 <= l-2) {
			k2 = k1;
			k3 = l - k1 - k2;
			while (k2 <= k3) {
				int sum2 = k1 * k2 * k3;
				if (sum < sum2)
					sum = sum2;
				k2 += 1;
				k3 -= 1;
			}
			k1 += 1;
		}
		System.out.println(sum);
		kb.close();
	}

}
