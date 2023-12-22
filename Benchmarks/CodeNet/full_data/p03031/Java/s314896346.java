import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numSwitch = sc.nextInt();
		int numLight = sc.nextInt();
		int needSwitch[] = new int[numLight];
		for(int i = 0; i < numLight; i ++) {
			int tmp = sc.nextInt();
			for(int j = 0; j < tmp; j ++) {
				needSwitch[i] |= 1 << (sc.nextInt() - 1);
			}
		}
		long need[] = new long[numLight];
		for(int i = 0; i < numLight; i ++) {
			need[i] = sc.nextLong();
		}

		long ans = 0;
		for(int state = 0; state < Math.pow(2, numSwitch); state ++) {
			boolean ok = true;
			for(int i = 0; i < numLight; i ++) {
				if(Integer.bitCount(needSwitch[i] & state) % 2 != need[i]) {
					ok = false;
					break;
				}
			}
			if(ok) { ans ++; }
		}
		System.out.println(ans);
	}
}