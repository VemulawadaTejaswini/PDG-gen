import java.math.BigInteger;
import java.util.*;


public class Main {
	
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int c = sc.nextInt();
			int [][] data = new int[c][c];
			for(int i = 0; i < c; i++){
				for(int j = 0; j < c; j++){
					data[i][j] = sc.nextInt();
				}
			}
			
			int [][] count = new int[3][c];
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					int color = sc.nextInt()-1;
					count[(i + j) % 3][color]++;
				}
			}
			
			int ans = Integer.MAX_VALUE;
			for(int i = 0; i < c; i++){
				for(int j = 0; j < c; j++){
					if(i == j) continue;
					for(int k  = 0; k < c; k++){
						if(i == k || j == k) continue;
						int sum = 0;
						for(int cc = 0; cc < c; cc++){
							sum += data[cc][i] * count[0][cc];
						}
						for(int cc = 0; cc < c; cc++){
							sum += data[cc][j] * count[1][cc];
						}
						for(int cc = 0; cc < c; cc++){
							sum += data[cc][k] * count[2][cc];
						}
						ans = Math.min(ans, sum);
					}
				}
			}
			System.out.println(ans);
		}
	}
	
	private long calc(long n, long m, long l){
		long sum = 1;
		for(long i = n; i > m; i--){
			sum *= i;
		}
		for(long i = 2; i <= l; i++){
			sum /= i;
		}
		return sum;
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
