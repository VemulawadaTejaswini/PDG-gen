import java.util.*;

public class Main {
	
	char [] data;
	boolean [] flg;
	long dfsres;
	
	private void dfs(int ind,int start, int max){
		if(max == ind){
			long nowsum = 0;
			long temp = 0;
			for(int i =0; i < data.length; i++){
				nowsum += (long)(data[i] - '0');
				if(i == data.length - 1)break;
				
				if(! flg[i]){
					nowsum *= 10;
				}
				else{
					temp += nowsum;
					nowsum = 0;
				}
			}
			temp += nowsum;
			dfsres += temp;
			return;
		}
		
		for(int i = start; i < data.length-1; i++){
			if(flg[i]) continue;
			
			flg[i] = true;
			dfs(ind + 1,i + 1, max);
			flg[i] = false;
		}
		return;
	}

	private void doit(){
		Scanner sc = new Scanner(System.in);
		long mod = 1000000007;
		while(sc.hasNext()){
			data = sc.next().toCharArray();
			int len = data.length;
			flg = new boolean[len];
			
			dfsres = 0;
			for(int i = 0; i < len; i++){
				dfs(0,0,i);
			}
			System.out.println(dfsres);
			
		}

	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
