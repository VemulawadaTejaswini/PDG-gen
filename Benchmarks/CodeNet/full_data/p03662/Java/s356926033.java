import java.util.*;

public class Main {
	int n, dis;
	ArrayList<ArrayList<Integer>> data;
	boolean []used;
	
	
	private int dfs(int pos, int deep){
		if(pos == n-1){
			dis = deep-1;
			return 0;
		}
		
		ArrayList<Integer> now = data.get(pos);
		int res = 0;
		for(int i = 0; i < now.size(); i++){
			int next = now.get(i);
			if(used[next]) continue;
			used[next] = true;
			res += dfs(next, deep+1);
		}
		return res+1;
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			n = sc.nextInt();
			data = new ArrayList<>();
			for(int i = 0; i < n; i++){
				data.add(new ArrayList<>());
			}
			
			
			for(int i = 0; i < n-1; i++){
				int a = sc.nextInt()-1;
				int b = sc.nextInt()-1;
				data.get(a).add(b);
				data.get(b).add(a);
				
			}
			dis = 0;
			used = new boolean[n];
			used[0] = true;
			
			int res = dfs(0, 0);
			int a = res-1-(dis / 2);
			int b = n - 2 - a;
			if(a > b){
				System.out.println("Fennec");
			}
			else
			{
				System.out.println("Snuke");
			}
		}
	}
	
	


	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
