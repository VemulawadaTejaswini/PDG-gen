
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main {
	static int N;
	static int[][] S;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			 N = sc.nextInt();

			 S = new int[N][2];
			 for(int i = 0 ; i < N ; i++){
				 for(int j = 0 ; j < 2 ; j++){
					 S[i][j] = sc.nextInt();
				 }
			 }
		sc.close();

	    Arrays.sort(S, new Comparator<int[]>() {
	        public int compare(int[] o1, int[] o2) {
	            //return o1[0] - o2[0];    //[0] をキーにソート(昇順)
	            return o2[0] - o1[0];    //[0] をキーにソート(降順)
	        }
	    });
/*
		 for(int i = 0 ; i < N ; i++){
			 for(int j = 0 ; j < 2 ; j++){
				 System.out.println(S[i][j]);
			 }
		 }
*/

	    long ans = S[0][0] + S[0][1];
	    System.out.println(ans);
	}
}