import java.util.*;
import java.math.*;
import java.lang.String;
import java.lang.System;
import java.lang.reflect.Array;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] sArr = s.split("");
		String[] arr = new String[s.length()];
		Arrays.fill(arr, "");
		int[] count = new int[s.length()];
		Arrays.fill(count, 0);
		boolean ok = true;
		
		for (int i = 0; i < s.length(); i++) {
			if (i == 0) {
				arr[i] = sArr[i];
				count[i]++;
			} else {
				boolean check = false;
				int J = 0;
				loop1: for (int j = 0; j < i; j++) {
					if (arr[j].equals(sArr[i])) {
						check = true;
						J = j;
						break loop1;
					}
				}
				if (check) {
					count[J]++;
				} else {
					count[i]++;
					arr[i] = sArr[i];
				}
			}
		}
		for (int i = 0; i < s.length(); i++) {
			if (!(count[i] % 2 == 0 || count[i] == 0)) {
				ok = false;
				break;
			}
		}
		if (ok) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	
	
	}
}
