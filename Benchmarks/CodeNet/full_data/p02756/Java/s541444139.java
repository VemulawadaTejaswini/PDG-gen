import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		char[] origin = scan.nextLine().toCharArray();
		int num = Integer.parseInt(scan.nextLine());
		
		//List<Character> list = new LinkedList<>();
		char[] list = new char[500000];
		int start = 200000;
		int end = start + origin.length - 1;
		
		for(int i = 0;i < origin.length;i ++) {
			list[start + i] = origin[i];
		}
		
		boolean reverse = false;
		
		for(int i = 0;i < num;i ++) {
			String que = scan.nextLine();
			if(que.charAt(0) == '1') {
				reverse = ! reverse;
			} else {
				if(que.charAt(2) == '1') {
					if(reverse) {
						end ++;
						list[end] = que.charAt(4);
					} else {
						start--;
						list[start] = que.charAt(4);
					}
				} else {
					if(reverse) {
						start--;
						list[start] = que.charAt(4);
					} else {
						end ++;
						list[end] = que.charAt(4);
					}
				}
			}
		}


		StringBuilder sb = new StringBuilder();
		char[] ans = new char[end - start + 1];
		/*for(int i = start;i < end + 1;i ++) {
			sb.append(list[i]);
		}*/
		
		System.arraycopy(list, start, ans, 0, ans.length);
		String str = new String(ans);
		
		if(reverse) {
			str = new StringBuilder(str).reverse().toString();
		}
		System.out.println(str);
	}
}
