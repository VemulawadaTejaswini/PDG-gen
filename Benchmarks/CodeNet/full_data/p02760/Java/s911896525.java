import java.util.*;

class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] num = new int[9];
		int[][] bingo = {{0,1,2}, {3,4,5}, {6,7,8}, {0,3,6}, {1,4,7}, {2,5,8}, {0,4,8}, {2,4,6}};
		boolean ok = false;
		
		for (int i=0; i<9; i++) {
			num[i] = sc.nextInt();
		}
		
		int N = sc.nextInt();
		
		for (int i=0; i<N; i++) {
			int b = sc.nextInt();
			for (int j=0; j<9; j++) {
				if (num[j] == b) {
					num[j] = 0;
				}
			}
		}
		
		for (int i=0; i<8; i++) {
			if (num[bingo[i][0]] + num[bingo[i][1]] + num[bingo[i][2]] == 0){
				ok = true;
			}
		}
		System.out.println(ok ? "Yes" : "No");
	}
}