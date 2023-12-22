import java.util.Scanner;
 
class Main {
	int n;
	int[] h;
	int[] cost;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Main m = new Main(sc);
		m.solve();
	}
	Main(Scanner sc){
		n = sc.nextInt();
		h = new int[n];
		cost = new int[n];
		for(int i = 0; i < n;i++){
			h[i] = sc.nextInt();
			cost[i] = Integer.MAX_VALUE;
		}
		cost[0] = 0;
	}
	int cntString(String str,char target){
		int cnt = 0;
		for(char s : str.toCharArray()){
			if(s == target){
				cnt++;
			}
		}
		return cnt;
	}
	void solve(){
		for(int i = 0;i < n-1;i++){
			cost[i+1] = Math.min(cost[i+1], cost[i] + Math.abs(h[i]-h[i+1]));
			if(i+2<n){
				cost[i+2] = Math.min(cost[i+2], cost[i] + Math.abs(h[i]-h[i+2]));
			}
		}
		System.out.println(cost[n-1]);
	}
}
