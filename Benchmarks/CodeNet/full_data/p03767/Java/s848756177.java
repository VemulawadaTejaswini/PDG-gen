import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);		
		Long result = 0l;
		Integer n = in.nextInt();
		Integer[] a = new Integer[3*n];
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}		
        Arrays.sort(a, Comparator.reverseOrder());
		for (int i = 1; i < 2 * n; i += 2) {
			result += a[i];
		}
		System.out.println(result);
	}
}