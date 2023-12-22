import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int K = stdIn.nextInt();
		long ans = 1;
		int count = 0;
		
		while(true) {
			if(isLunlun(ans)) {
				count ++;
				if(count == K) {
					break;
				}
			}
			ans ++;
		}
		
		System.out.println(ans);
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