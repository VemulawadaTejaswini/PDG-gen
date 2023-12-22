import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
 
	public static void main(String[] args) {  
		Scanner input = new Scanner(System.in);
		int R = input.nextInt();
		int C = input.nextInt();
		int N = input.nextInt();
		int[] arr = new int[N+1];
		int[][] ans = new int[R][C];
		for (int i = 1; i <= N; i++) {
			arr[i] = input.nextInt();
		}
		int index = 1;
		for (int r = 0; r < R; r++) {
			if (r%2==0) {
				for (int c = 0; c< C; c++){
					ans[r][c]=index;
					arr[index]--;
					if (arr[index]==0) index++;
				}
			}else {
				for (int c = C-1; c>=0; c--) {
					ans[r][c]=index;
					arr[index]--;
					if (arr[index]==0) index++;
				}
			}
		}
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
}
