import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int K = stdIn.nextInt();
		long ans = 1;
		int count = 0;
		
		ArrayList<Long> list = new ArrayList<Long>();
		
		for(int i = 1; i < 10; i ++) {
			list.add((long)i);
		}
		
		int i = 0;
		
		while(list.size() < K) {
			long val = list.get(i);
			if(val % 10 != 0) {
				list.add(val * 10 + val % 10 - 1);
			}
			list.add(val * 10 + val % 10);
			if(val % 10 != 9) {
				list.add(val * 10 + val % 10 + 1);
			}
			i ++;
		}
		
		System.out.println(list.get(K - 1));
		
//		while(true) {
//			if(isLunlun(ans)) {
//				count ++;
//				if(count == K) {
//					break;
//				}
//			}
//			ans ++;
//		}
//		
//		System.out.println(ans);
	}
	
	public static boolean isLunlun(long num) {
		boolean lunlun = true;
		char[] chArr = Long.toString(num).toCharArray();
		for(int i = 0; i < chArr.length - 1; i ++) {
			if(1 < Math.abs((int)chArr[i] - (int)chArr[i + 1])) {
				lunlun = false;
				break;
			}
		}
		return lunlun;
	}
}