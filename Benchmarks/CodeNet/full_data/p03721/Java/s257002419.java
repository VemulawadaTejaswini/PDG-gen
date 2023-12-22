import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long K = sc.nextLong();
		int[][] S = new int[N][2];

		for(int i = 0 ; i < N ; i++){
			S[i][0] = sc.nextInt();
			S[i][1] = sc.nextInt();
		}
		sc.close();

	    Arrays.sort(S, new Comparator<int[]>() {
	        public int compare(int[] o1, int[] o2) {
	            //return o1[0] - o2[0];    //[0] をキーにソート(昇順)
	            return o1[0] - o2[0];    //[0] をキーにソート(降順)
	        }
	    });

	    int tmp = 0 ;
	    for(int i = 0 ; i < N ; i++){
	    		tmp += S[i][1];
	    		if(tmp >=K){
	    			System.out.println(S[i][0]);
	    			break;
	    		}
	    }
	}
}
