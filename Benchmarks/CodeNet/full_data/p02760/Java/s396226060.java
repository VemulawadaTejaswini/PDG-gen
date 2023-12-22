import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		int M = Integer.parseInt(sc.next());
//		String S = sc.next();
		int[][] bingo = new int[3][3];
		List<Integer> bingoList = new ArrayList();
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				int a = Integer.parseInt(sc.next());
				bingo[i][j] = a;
				bingoList.add(a);
			}
		}
		int N = Integer.parseInt(sc.next());
		for(int i=1; i<=N; i++) {
			int aa = Integer.parseInt(sc.next());
			if(bingoList.contains(aa)) {
				for(int n=0; n<3; n++) {
					for(int j=0; j<3; j++) {
						if(bingo[n][j] == aa) {
							bingo[n][j] = 0;
						}
					}
				}
			}
		}
		label:for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if(bingo[i][0]+bingo[i][1]+bingo[i][2] == 0 ||
					   bingo[0][0]+bingo[1][1]+bingo[2][2] == 0 ||
					   bingo[0][2]+bingo[2][2]+bingo[2][0] == 0) {
						System.out.println("Yes");
						break label;
					} else {
						System.out.println("No");
						break label;
					}
				}
		}
	}
}
