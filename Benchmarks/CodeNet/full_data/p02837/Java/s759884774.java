import java.util.*;

public class Main{
	static Scanner sc = new Scanner(System.in);
	static int n = 0;
	
	public static void main(String[] args){
		n = sc.nextInt();
		int ub = 1 << n;
		int[] a = new int[n];
		int[][] x = new int[n][];
		int[][] y = new int[n][];
		for(int i = 0; i < n; ++i){
			a[i] = sc.nextInt();
			x[i] = new int[a[i]];
			y[i] = new int[a[i]];
			for(int j = 0; j < a[i]; ++j){
				x[i][j] = sc.nextInt();
				y[i][j] = sc.nextInt();
			}
		}
		
		int ans = 0;
		for(int num = 0; num < ub; ++num){
			int[] info = getBinary(num, n);
			//System.out.println(Arrays.toString(info));
			int numHonest = count1(info);
			//System.out.println("numHonest = " + numHonest);
			for(int i = 0; i < n; ++i){
				if(info[i] == 0) continue;
				for(int j = 0; j < a[i]; ++j){
					if(info[x[i][j] - 1] != y[i][j]){
						//System.out.println(x[i][j] + " person is not " + y[i][j]);
						numHonest = -1;
						break;
					}
				}
				if(numHonest < 0) break;
			}
			//System.out.println("numHonest = " + numHonest);
			ans = (numHonest > ans) ? numHonest : ans;
			//System.out.println("ans = " + ans);
		}
		System.out.println(ans);
	}
	
	static int[] buildBinExps(int w){
		int[] res = new int[w];
		for(int i = 0; i < w; ++i){
			res[i] = (i == 0) ? 1 : 2 * res[i - 1];
		}
		return res;
	}
	
	static int[] getBinary(int num, int w){
		int[] res = new int[w];
		for(int i = 0; i < w; ++i){
			res[i] = (num % 2 == 1) ? 1 : 0;
			num /= 2;
		}
		return res;
	}
	
	static int count1(int[] info){
		int res = 0;
		for(int i = 0; i < n; ++i){
			if(info[i] == 1) ++res;
		}
		return res;
	}
}