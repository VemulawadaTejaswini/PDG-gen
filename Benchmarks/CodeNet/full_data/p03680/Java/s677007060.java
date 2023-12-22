import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		int index = 0;
		int nextIndex = -1;
		boolean isOK = false;
		int count = 0;
		while (true) {
			nextIndex = a[index] - 1;
			if (index == a[nextIndex] - 1) {
				break;
			}
			count++;
			if (a[index] == 2) {
				isOK = true;
				break;
			}
			index = nextIndex;
		}
		System.out.println(isOK ? count : -1);
		sc.close();
	}
}