import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		char[] s = new Scanner(System.in).next().toCharArray();
		int[] count = new int[3];
		int n = s.length;
		for(int i=0;i<n;i++) {
			count[s[i]-'a']++;
		}
		Arrays.sort(count);
		System.out.println(count[2] - count[0] <= 1 ? "YES" : "NO");
	}

}