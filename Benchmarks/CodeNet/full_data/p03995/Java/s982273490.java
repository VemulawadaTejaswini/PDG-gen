import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int R = sc.nextInt();
		int C = sc.nextInt();
		int N = sc.nextInt();
		
		int[][] grid = new int[R][C];
		
		for(int i=0; i<R; ++i) {
			for(int j=0; j<C; ++j) {
				grid[i][j] = -1;
			}
		}
		
		for(int i=0; i<N; ++i) {
			int ri = sc.nextInt();
			int ci = sc.nextInt();
			int ai = sc.nextInt();
			grid[ri-1][ci-1] = ai;
		}
		
		boolean res = false;
		int lu = grid[0][0];
		int ld = grid[R-1][0];
		int ru = grid[0][C-1];
		int rd = grid[R-1][C-1];
		if((lu!=-1) && (ld!=-1) && (ru!=-1) && (rd!=-1))
			res = ((lu+rd)==(ru+ld)) ? true : false;
		else if((lu==-1) || (rd==-1) && (ru==-1) || (ld==-1))
			res = true;
		else if((lu!=-1) && (rd!=-1)) {
			ru = (ru == -1) ? 0 : ru;
			ld = (ld == -1) ? 0 : ld;
			res = ((lu+rd)>(ru+ld)) ? true : false;
		}
		else if((ru!=0) && (ld!=0)) {
			ru = (lu == -1) ? 0 : ru;
			ld = (rd == -1) ? 0 : ld;
			res = ((lu+rd)<(ru+ld)) ? true : false;
		}
		
		String s = res ? "Yes": "No";
		System.out.println(s);
		sc.close();
	}
}