import java.util.ArrayList;
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
		int count = 0;
		byte[][] array = new byte[n][26];
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			for (int j = 0; j < 10; j++) {
				array[i][(int) (s.charAt(j) - 'a')]++;
			}
		}
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				boolean flag = true;
				for (int k = 0; k < array[i].length; k++) {
					if (array[i][k] != array[j][k]) {
						flag = false;
						break;
					}
				}
				if (flag) {
					++count;
				}
			}
		}
		System.out.println(count);
	}
}
