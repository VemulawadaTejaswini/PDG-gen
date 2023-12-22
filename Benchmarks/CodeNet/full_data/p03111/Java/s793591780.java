import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long want[] = new long[3];
		for(int i = 0; i < 3; i ++) {
			want[i] = sc.nextLong();
		}
		long length[] = new long[num];
		for(int i = 0; i < num; i ++) {
			length[i] = sc.nextLong();
		}
		long min = Long.MAX_VALUE;
		for(int i = 0; i < Math.pow(4, num); i ++) {
			int choose[] = new int[num];
			for(int j = 0; j < num; j ++) {
				choose[j] = (i & (3 << j * 2)) >> j * 2;
			}
			int tmpL[] = new int[4];
			int add[] = new int[4];
			for(int j = 0; j < num; j ++) {
				tmpL[choose[j]] += length[j];
				add[choose[j]] ++;
			}
			if(tmpL[0] == 0 || tmpL[1] == 0 || tmpL[2] == 0) { continue; }
			long tmpMP = 0;
			for(int j = 0; j < 3; j ++) {
				tmpMP += (add[j] - 1) * 10;
				tmpMP += Math.abs(tmpL[j] - want[j]);
			}
			min = Math.min(min, tmpMP);
		}
		System.out.println(min);
	}
}