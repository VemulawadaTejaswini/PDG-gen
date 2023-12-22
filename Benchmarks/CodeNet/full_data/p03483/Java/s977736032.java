

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		ArrayList<Character> strs = new ArrayList<Character>();
		ArrayList<Integer> str_nums = new ArrayList<Integer>();
		
		
		int index, len = str.length();
		for(int i = 0; i < len; i++) {
			char c = str.charAt(i);
			if ((index = strs.indexOf(c)) == -1) {
				strs.add(c);
				str_nums.add(1);
			}else {
				str_nums.set(index, str_nums.get(index) + 1);
			}
		}
		
		
		int count = 0;
		char last = 's';
		for (int i = 0; i < str_nums.size(); i++) {
			if (str_nums.get(i) % 2 == 1) {
				count++;
				last = strs.get(i);
			}else {
				for (int j = 0; j < str_nums.get(i)/2; j++);
			}
			if (count >= 2) {
				System.out.println("-1");break;
			}
		}
		
		long start = System.currentTimeMillis();
		if(count <= 1) {
			count = 0;
			char[] strA = str.toCharArray();
			int[] strIndex = new int[strA.length];
			/*strIndex 
			 * 右端までの距離が入る 0は確定済み
			 * */
			int i = 0, j = strA.length-1, l, r, k, right, left;
			len = strA.length;
			for (i = 0; i < len; i++) {
				strIndex[i] = len - i;
			}
			right = len-1;
			left = 0;
			for (i = 0; i < len / 2; i++) {
				if(strIndex[i] != 0 && strIndex[j] != 0) {
					if (strA[i] != strA[j]) {
						if(strA[j] != last) {	//右端確定
							k = i+1;
							while(strA[j] != strA[k] || strIndex[k] == 0)k++;
							strIndex[k] = 0;
							//strIndex更新
							for(l = k-1; l >= 0; l--) {
								if((r =strIndex[l]) != 0) {	//確定してない要素を移動
									strIndex[l] = r-1;
								}
							}
							count += k - i;
						}else {	//左端確定
							k = j-1;
							while(strA[i] != strA[k] || strIndex[k] == 0)k--;
							strIndex[k] = 0;
							//strIndex更新
							for(l = k-1; l >= 0; l--) {
								if((r =strIndex[l]) != 0) {	//確定してない要素を移動
									strIndex[l] = r-1;
								}
							}
							count += j - k;
						}
						/*for(int g = 0; g < strIndex.length; g++) {
							System.out.print(strIndex[g] + " ");
						}
						System.out.print("\n");
						*/
					}
				}
				j--;
			}
			
			/*
			for (i = 0; i < len / 2; i++) {
				if (strA[i] != strA[j]) {
					if(strA[j] != last) {
						k = i+1;
						while(strA[j] != strA[k])k++;
						charMove(strA, k, i);
						count += k - i;
					}else {
						k = j-1;
						while(strA[i] != strA[k])k--;
						charMove(strA, k, j);
						count += j - k;
					}
					//System.out.println(strA);
				}
				j--;
			}
			*/
			
			System.out.println(count);
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start+ "ms");
	}
	
	public static void charMove(char[] str, int start, int end) {
		char t;
		if(end - start > 0) {
			for(int i = start; i < end; i++) {
				t = str[i];
				str[i] = str[i+1];
				str[i+1] = t;
			}
		}else {
			for(int i = start; i >= end+1; i--) {
				t = str[i];
				str[i] = str[i-1];
				str[i-1] = t;
			}
		}
	}
}
