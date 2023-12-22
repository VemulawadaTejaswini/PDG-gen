import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		int n = arr.length;
		int nextL = 0;
		int nextR = 0;
		int[] org = new int[n];
		for (int i = 0; i < n; i++) {
			if (arr[i] == 'R') {
				if (nextL < i) {
					nextL = i;
				}
				while (arr[nextL] == 'R') {
					nextL++;
				}
				if ((nextL - i) % 2 == 0) {
					org[nextL]++;
				} else {
					org[nextL - 1]++;
				}
				nextR = i;
			} else {
				if ((i - nextR) % 2 == 0) {
					org[nextR]++;
				} else {
					org[nextR + 1]++;
				}
			}
		} 
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			if (i != 0) {
				sb.append(" ");
			}
			sb.append(org[i]);
		}
		System.out.println(sb);
	}
}
