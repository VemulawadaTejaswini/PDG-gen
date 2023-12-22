import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);		
		Long result = 0l;
		int n = in.nextInt();
		int[] a = new int[3];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < a.length; j++) {
				a[j] = in.nextInt();
			}
			Arrays.sort(a);
			result += a[1];
		}
		System.out.println(result); 
	}
}