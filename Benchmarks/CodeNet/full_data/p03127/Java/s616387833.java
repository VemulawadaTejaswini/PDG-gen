import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] m = new int[n];
		for (int i = 0; i < n; ++i) {
			m[i] = sc.nextInt();
		}

		boolean f = false;
		while (true) {
			Arrays.sort(m);
			if (m[n-2] == 0) {
				System.out.println(m[n-1]);
				break;
			} else {
				for (int i = 0; i < n; ++i) {
					if (m[i] != 0) {
						int t = m[n - 1] / m[i];
						m[n - 1] -= (m[i] * t);
						break;
					}
				}
			}
		}
	}
}