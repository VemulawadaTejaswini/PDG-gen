import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] A = new int[N];
		for(int i = 0 ; i < N ; i++){
			A[i] = sc.nextInt();
		}
		int[][] S = new int[M][2];

		for(int i = 0 ; i < M ; i ++){
			S[i][0] = sc.nextInt();
			S[i][1] = sc.nextInt();
		}
		sc.close();

		Queue<Integer> queue = new PriorityQueue<Integer>();
		for(int i = 0 ; i < N ; i++){
			queue.add(A[i]);
		}

	    Arrays.sort(S, new Comparator<int[]>() {
	        public int compare(int[] o1, int[] o2) {
	            return o2[1] - o1[1];
	        }
	    });
	    
	    long ans = 0;
		while(!queue.isEmpty()){
			int a = queue.poll();
			for(int i = 0 ; i <M ; i++){
				if(S[i][0] > 0 && S[i][1] > a){
					ans += S[i][1];
					S[i][0]--;
					break;
				}
				else if(S[i][0] == 0){
					continue;
				}
				else{
					ans += a;
					break;
				}
			}
		}
		System.out.println(ans);
	}
}