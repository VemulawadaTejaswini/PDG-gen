import java.util.*;

public class Main {
	int [] dx = {0,1,0,-1};
	int [] dy = {1,0,-1,0};
	
	private void doit(){
		
		Scanner sc = new Scanner(System.in);
		long mod = 1000000007;
		while(sc.hasNext()){
			int h = sc.nextInt();
			int w = sc.nextInt();
			char [][] data = new char[h][w];
			for(int i = 0; i < h;i++){
				data[i] = sc.next().toCharArray();
			}
			
			boolean flg = false;
			for(int i = 0; i < h;i++){
				for(int j = 0; j < w;j++){
					int count =0 ;
					for(int k =0; k < 4;k++){
						int yy = i + dy[k];
						int xx = j + dx[k];
						if(0 <= xx && xx < w && 0 <= yy && yy < h){
							if(data[yy][xx] == '#'){
								count++;
							}
							
						}
					}
					if(count >= 3){
						flg = true;
					}
				}
			}
			System.out.println(!flg ? "Possible" : "Impossible");
		}

	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
