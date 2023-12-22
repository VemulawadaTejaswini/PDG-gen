import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int max = 0;
		for (int i = 1; i < n; i++) {
			boolean[][] arr = new boolean[2][26];
			for (int j = 0; j < n; j++) {
				int idx;
				if (j < i) {
					idx = 0;
				} else {
					idx = 1;
				}
				arr[idx][s.charAt(j) - 'a'] = true;
			}
			int count = 0;
			for (int j = 0; j < 26; j++) {
				if (arr[0][j] && arr[1][j]) {
					count++;
				}
			}
			if (count > max) {
				max = count;
			}
		}
		System.out.println(max);
	}
	
}
