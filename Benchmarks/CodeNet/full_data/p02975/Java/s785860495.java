import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long cap[] = new long[num];
		for(int i = 0; i < num; i ++) {
			cap[i] = sc.nextLong();
		}
		Arrays.sort(cap);
		long intCap[] = {cap[0], -1, -1};
		long numCap[] = {1, 0, 0};
		int type = 0;
		for(int i = 1; i < num; i ++) {
			if(intCap[type] != cap[i]) {
				type ++;
				if(type >= 3) {
					System.out.println("No"); return;
				}
				intCap[type] = cap[i];
			}
			numCap[type] ++;
		}
		type ++;

		if(type == 1) {
			System.out.println(intCap[0] == 0 ? "Yes" : "No"); return;
		}
		if(type == 2) {
			System.out.println(intCap[0] == 0 && numCap[1] == numCap[0] * 2
			 ? "Yes" : "No"); return;
		}
		if(type == 3) {
			System.out.println(numCap[0] == numCap[1] && numCap[1] == numCap[2]
					&& intCap[2] == (intCap[1] ^ intCap[0])
			 ? "Yes" : "No"); return;
		}
	}
}