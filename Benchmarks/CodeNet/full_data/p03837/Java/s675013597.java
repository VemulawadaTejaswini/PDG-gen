import java.util.*;

public class Main {
	int [][] via;
	boolean [][] used;
	
	void printPath1_aux(int begin, int end) {
	    if (via[begin][end] == begin) {
	        if (begin != end){
//	            System.out.printf("%d ", begin);
	        	used[begin][end] = true;
	        	used[end][begin] = true;
	        }
	        return;
	    }

	    printPath1_aux(begin, via[begin][end]);
	    printPath1_aux(via[begin][end], end);
	}

	void printPath1(int start, int goal) {
	    printPath1_aux(start, via[start][goal]);
	    printPath1_aux(via[start][goal], goal);
//	    System.out.printf("%d\n", goal);
	}
	
	private void doit(){
		
		Scanner sc = new Scanner(System.in);
		long mod = 1000000007;
		int INF = 1 << 29;
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int [][] pass = new int[n][n];
			int [][] orig = new int [n][n];
			via = new int[n][n];
			used = new boolean[n][n];
			for(int i =0; i < n;i++){
				Arrays.fill(pass[i], INF);
				pass[i][i] = 0;
				Arrays.fill(orig[i], INF);
				orig[i][i] = 0;
				
				Arrays.fill(via[i], i);
			}
			
			for(int i = 0; i < m; i++){
				int a = sc.nextInt() - 1;
				int b = sc.nextInt() - 1;
				int c = sc.nextInt();
				pass[a][b] = c;
				pass[b][a] = c;
				orig[a][b] = c;
				orig[b][a] = c;
			}
			
			for(int j = 0; j < n; j++){
				for(int i = 0; i < n; i++){
					for(int k = 0; k < n; k++){
//						pass[i][k] = Math.min(pass[i][k], pass[i][j] + pass[j][k]);
						if(pass[i][k] > pass[i][j] + pass[j][k]){
							pass[i][k] = pass[i][j] + pass[j][k];
							via[i][k] = j;
						}
					}
				}
			}
			
			for(int i =0; i < n;i++){
				for(int j = 0; j <n; j++){
//					debug(i, j, pass[i][j]);
					printPath1(i, j);
				}
			}
			
			int count = 0;
			for(int i =0; i < n; i++){
				for(int j = i+ 1; j < n; j++){
					if( orig[i][j] == INF || used[i][j]) continue;
					
					count++;
				}
			}
			System.out.println(count);
		}

	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
