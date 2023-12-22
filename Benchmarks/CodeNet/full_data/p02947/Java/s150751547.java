import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long count = 0L;
		byte[][] array = new byte[n][26];
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			for (int j = 0; j < 10; j++) {
				array[i][(int) (s.charAt(j) - 'a')]++;
			}
		}
		boolean[] flagArray = new boolean[n];
		Arrays.fill(flagArray, true);
		for (int i = 0; i < n - 1; i++) {
			long tmpCount = 0L;
			if (!flagArray[i]) {
				continue;
			}
			boolean[] tmpflag = new boolean[n];
			for (int j = i + 1; j < n; j++) {
				if (!flagArray[j]) {
					continue;
				}
				boolean flag = true;
				for (int k = 0; k < array[i].length; k++) {
					if (array[i][k] != array[j][k]) {
						flag = false;
						break;
					}
				}
				if (flag) {
					tmpflag[j] = true;
					++tmpCount;
				}
			}
			for (int j = 0; j < tmpflag.length; j++) {
				if (tmpflag[j]) {
					flagArray[j] = false;
				}
			}
			tmpCount = (long) Math.pow(tmpCount, 2);
			if (tmpCount > 1) {
				--tmpCount;
			}
			count += tmpCount;
		}
		System.out.println(count);
	}
}
