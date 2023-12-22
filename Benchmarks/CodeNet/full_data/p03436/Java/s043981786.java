import java.util.*;


public class Main {
	
	int h,w, ans;
	char [][] data;
	boolean [][] used;
	
	int [] dy = {-1,0,1,0};
	int [] dx = {0,1, 0,-1};
	
	private void dfs(int x, int y, int step){
		if(x == w-1 && y == h-1){
			ans = step;
			return;
		}
		for(int i = 0; i < 4; i++){
			int xx = x + dx[i];
			int yy = y + dy[i];
			if(!(0<= xx && xx < w && 0<= yy && yy < h)){
				continue;
			}
			if(data[yy][xx] == '#') continue;
			if(used[yy][xx]) continue;
			used[yy][xx] = true;
			dfs(xx, yy, step + 1);
			if(ans != 0) break;
			used[yy][xx] = false;
		}
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			h = sc.nextInt();
			w = sc.nextInt();
			data = new char[h][w];
			for(int i = 0; i < h; i++){
				data[i] = sc.next().toCharArray();
			}
			int count = 0;
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					if(data[i][j] == '.') count++;
				}
			}
			used = new boolean[h][w];
			
			used[0][0] = true;
			ans = 0;
			dfs(0,0,0);
			if(ans == 0){
				System.out.println(-1);
			}
			else{
				System.out.println(count - ans - 1);
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
