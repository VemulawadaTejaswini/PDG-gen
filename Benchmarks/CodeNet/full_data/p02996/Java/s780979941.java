import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
 
 
public class Main {

	static long MOD = 1_000_000_007;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//int N = Integer.parseInt(sc.next());
		//long L = Long.parseLong(sc.next());

		Scanner sc = new Scanner(System.in);
		//char[] c = sc.next().toCharArray();
		int N = Integer.parseInt(sc.next());
		int[][] task = new int [N][2];
		for(int i=0; i<N; i++){
			task[i][0] = Integer.parseInt(sc.next());
			task[i][1] = Integer.parseInt(sc.next());
		}
		
		int INF = Integer.MAX_VALUE;
		int INF_MIN = -1000;//Integer.MIN_VALUE;
		
		Arrays.sort(task,(a,b)->Integer.compare(a[1], b[1]));
		
		int sum = 0;
		int space = 0;
		boolean flag = true;
		for(int i=0;i<N;i++){
			sum += task[i][0];
			space = task[i][1] - sum;
			if(space < 0){
				flag = false;
				break;
			}
		}
		
		if(flag){
			System.out.println("Yes");
			
		}else{
			System.out.println("No");
			
		}
		

		
		
	
		
		
	}
	static long lcm (long a, long b) {
		long temp;
		long c = a;
		c *= b;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return (c/b);
	}
}

