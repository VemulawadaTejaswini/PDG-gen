import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] l = new int[n];
		for (int i = 0; i < n; i++) {
			l[i] = sc.nextInt();
		}
		int count = 0;
		for (int i = 0; i < n - 2; i++) {
			if ((l[i + 1] >= l[i] && l[i + 1] <= l[i + 2]) || (l[i + 1] >= l[i + 2] && l[i + 1] <= l[i])) {
				count++;
			}
			
		}
System.out.println(count);
	}
}
