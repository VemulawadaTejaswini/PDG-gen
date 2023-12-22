import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String origin = scan.nextLine();
		int num = Integer.parseInt(scan.nextLine());
		
		StringBuilder sb = new StringBuilder(origin);
		
		boolean reverse = false;
		
		for(int i = 0;i < num;i ++) {
			char[] que = scan.nextLine().toCharArray();
			if(que[0] == '1') {
				reverse = ! reverse;
			} else {
				if(que[2] == '1') {
					if(reverse) {
						sb.append(que[4]);
					} else {
						sb.insert(0, que[4]);
					}
				} else {
					if(reverse) {
						sb.insert(0, que[4]);
					} else {
						sb.append(que[4]);
					}
				}
			}
		}

		if(reverse) {
			sb.reverse();
		}
		System.out.println(sb.toString());
	}
}
