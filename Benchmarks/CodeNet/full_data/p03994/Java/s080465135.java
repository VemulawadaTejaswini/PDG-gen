import java.util.*;
import java.math.*;
import java.lang.String;
import java.lang.System;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k = sc.nextInt();
		int len = s.length();
		char[] charArray = s.toCharArray();
		int i = 0;
		
		while (k > 0){
			int number = alpabetNumber(charArray[i]);
			if ((27 - number) <= k) {
				charArray[i] = 'a';
				k = k - (27 - number);
			}
			i++;
			if (i == len) {
				if (k > 0) {
					for (int j = 0; j < len; j++) {
						if (charArray[j] != 'a') {
							number = alpabetNumber(charArray[j]);
							if ((27 - number) <= k) {
								charArray[i] = 'a';
								k = k - (27 - number);
							} else {
								for (int m = 0; m < k; m++) {
									charArray[j]++;
									k--;
								}
							}
						}
					}
					if (k == 0) {
						break;
					}
					k = k % 25;
					if (len == 1) {
						if (k == 0) {
							charArray[0] = 'z';
						} else {
							for (int j = 0; j < k; j++) {
								charArray[j]++;
								k--;
							}
						}
					} else {
						i = len - 1;
						if (k == 0) {
							charArray[i] = 'z';
						} else {
							while (k > 0) {
								charArray[i]++;
								k--;
							}
						}
					}
					
				}
			}
		}
		
		for (i = 0; i < len; i++) {
			if (i != len - 1) {
				System.out.print(charArray[i]);
			} else {
				System.out.println(charArray[i]);
			}
		}
	}
	
	private static int alpabetNumber(char c) {
		int number = 1;
		char L00 = 'a';
		
		while (L00 != c) {
			number++;
			L00++;
		}
        return number;
    }
	
	
}