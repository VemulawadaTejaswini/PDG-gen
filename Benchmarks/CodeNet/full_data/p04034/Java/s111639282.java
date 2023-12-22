import java.util.*;

public class Main {

	private void doit(){
		Scanner sc = new Scanner(System.in);
		long mod = 1000000007;
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int [] count = new int[n];
			Arrays.fill(count, 1);
			boolean [] flg = new boolean[n];
			flg[0] = true;
			
			for(int i = 0; i < m; i++){
				int a = sc.nextInt() - 1;
				int b = sc.nextInt() - 1;
				count[a]--;
				
				count[b]++;
				if(flg[a]){
					flg[b] = true;
				}
				
				if(flg[a] && count[a] == 0){
					flg[a] = false;
				}
			}
			
			int ans = 0;
			for(int i = 0; i < n; i++){
				if(flg[i])ans++;
			}
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
