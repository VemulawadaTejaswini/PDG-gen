import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long integer[] = new long[num];
		boolean plus[] = new boolean[num];
		boolean done[] = new boolean[num];
		for(int i = 0; i < num; i ++) {
			integer[i] = sc.nextLong();
		}
		Arrays.sort(integer);
		for(int i = 0; i < num; i ++) {
			done[i] = false;
			plus[i] = i == 0 ? false : i == num - 1 ? true : integer[i] >= 0;
		}
		int count[] = {0, 0};
		int ans = 0;
		for(int i = 0; i < num; i ++) {
			count[plus[i] ? 1 : 0] ++;
			ans += integer[i] * (plus[i] ? 1 : -1);
		}
		System.out.println(ans);
		for(int i = num; i >= 2; i --) {
			int tmp[] = {0, 0};
			for(int j = num - 1; j >= 0; j --) {
				if(plus[j] && !done[j]) { tmp[1] = j; break; }
			}
			for(int j = 0; j < num; j ++) {
				if(!plus[j] && !done[j]) { tmp[0] = j; break; }
			}
			if(count[1] <= count[0]) {
				System.out.println(integer[tmp[1]]+" "+integer[tmp[0]]);
				integer[tmp[1]] -= integer[tmp[0]];
				done[tmp[0]] = true;
				count[0] --;
			}else {
				System.out.println(integer[tmp[0]]+" "+integer[tmp[1]]);
				integer[tmp[0]] -= integer[tmp[1]];
				done[tmp[1]] = true;
				count[1] --;
			}
		}
	}
}