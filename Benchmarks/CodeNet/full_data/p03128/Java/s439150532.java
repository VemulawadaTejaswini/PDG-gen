import java.util.*;
public class Main {
	static long count[] = new long[10];
	static long max = 0;
	static long ansCount[] = new long[10];
	static boolean canUse[] = new boolean[10];
	static int need[] = {0, 2, 5, 5, 4, 5, 6, 3, 7, 6};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextInt();
		int type = sc.nextInt();
		for(int i = 0; i < type; i ++) {
			canUse[sc.nextInt()] = true;
		}
		check(2, num);
		for(int i = 9; i > 0; i --) {
			for(int j = 0; j < ansCount[i]; j ++) {
				System.out.print(i);
			}
		}
		System.out.println();
	}
	public static boolean check(int minNeed, long num) {
		if(minNeed >= 8 || minNeed > num) {
			return false;
		}
		int useNumber = 9;
		for(; useNumber > 0; useNumber --) {
			if(need[useNumber] == minNeed && canUse[useNumber]) {
				break;
			}
		}
		if(useNumber == 0) {
			return check(minNeed + 1, num);
		}
		long rest = num % minNeed;
		count[useNumber] = (num - rest) / minNeed;
		if(rest == 0) {
			repl();
			count[useNumber] = 0;
			return true;
		}
		while(count[useNumber] >= 0) {
			if(check(minNeed + 1, rest)) {
				break;
			}
			count[useNumber] --;
			rest += minNeed;
		}
		count[useNumber] = 0;
		return false;
	}

	public static void repl() {
		long sum = 0;
		for(int i = 0; i < 10; i ++) {
			sum += count[i];
		}
		if(sum >= max) {
			boolean replace = false;
			for(int i = 9; i > 0; i --) {
				if(count[i] > ansCount[i]) {
					replace = true;
					break;
				}else if (count[i] < ansCount[i]) {
					replace = false;
					break;
				}
			}
			if(sum > max || replace) {
				max = sum;
				for(int i = 0; i < 10; i ++) {
					ansCount[i] = count[i];
				}
			}
		}
	}
}