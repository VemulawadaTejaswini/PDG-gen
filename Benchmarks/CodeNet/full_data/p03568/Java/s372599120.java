import java.util.*;


public class Main {
	int n;
	int [] data;
	long ans;
	
	private void dfs(int ind, long sum){
		if(ind == n){
			if(sum%2 == 0)ans++;
			return;
		}
		
		int now = data[ind];
		dfs(ind+1, sum * (now -1));
		dfs(ind+1, sum * now);
		dfs(ind+1, sum * (now+1));
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			n = sc.nextInt();
			data = new int[n];
			for(int i =0 ; i < n; i++){
				data[i] = sc.nextInt();
			}
			ans = 0;
			dfs(0, 1);
			System.out.println(ans);
		}
	}



	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
