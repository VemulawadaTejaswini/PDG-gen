public class Main {
	public static void main(String[] args) {
	    java.util.Scanner scanner = new java.util.Scanner(System.in);
	    int n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		java.util.Arrays.sort(a);
		int count = 0;
		int before = -1;
		for (int i = 0; i < n; i++) {
			if (a[i] - before == 0) {
				count--;
			} else {
				count++;
			}
			before = a[i];
		}
		System.out.println(count);
	}
}