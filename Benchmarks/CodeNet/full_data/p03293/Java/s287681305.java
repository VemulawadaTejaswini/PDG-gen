import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] str1 = sc.next().toCharArray();
		char[] str2 = sc.next().toCharArray();
		Arrays.sort(str1);
		Arrays.sort(str2);
		if(str1.length != str2.length) {
			System.out.println("No");
			return;
		}
		for(int i = 0; i < str1.length; i++) {
			if(str1[i] != str2[i]) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}
