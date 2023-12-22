import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int h = kb.nextInt();
		int n = kb.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			int j = kb.nextInt();
			a[i] = j;
		}
		for (int e : a) {
			h -= e;
		}
		if (h <= 0)
			System.out.println("Yes");
		else
			System.out.println("No");
		kb.close();
	}

}
