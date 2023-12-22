package ABC_B;

import java.util.Arrays;
import java.util.Scanner;

public class IrohaLovesStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		String[] array = new String[n];
		
		for(int i =0; i < n; i++) {
			array[i] = sc.next();
		}
		Arrays.sort(array);
		
		for(int i = 0; i < n; i++) {
			System.out.print(array[i]);
		}
		
	}
}
