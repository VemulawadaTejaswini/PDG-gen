import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long ln[] = {sc.nextLong() - 1, sc.nextLong()};
		boolean odd[] = {ln[0] % 2 == 1, ln[1] % 2 == 1};
		boolean odd4[] = {ln[0] % 4 == 1 || ln[0] % 4 == 2, ln[1] % 4 == 1 || ln[1] % 4 == 2};
		boolean bit[][] = new boolean[2][42];
		for(int i = 0; i < 2; i ++) {
			for(int j = 0; j < 42; j ++) {
				bit[i][j] = (ln[i] & (1L << j)) != 0;
				if(j == 0) {
					bit[i][j] = odd4[i];
				}else {
					bit[i][j] &= !odd[i];
				}
			}
		}
		long ans = 0;
		for(int j = 0; j < 42; j ++) {
			ans += (bit[0][j] ^ bit[1][j] ? 1 : 0) * (1L << j);
		}
		System.out.println(ans);
	}
}