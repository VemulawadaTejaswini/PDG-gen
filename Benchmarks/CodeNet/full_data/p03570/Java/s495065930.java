import java.util.*;


public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			char [] data = sc.next().toCharArray();
			int n = data.length;
			int [][] acc = new int[n][26];
			acc[0][data[0] - 'a']++;
			for(int i = 1; i < n; i++){
				acc[i] = acc[i-1].clone();
				acc[i][data[i] - 'a']++;
			}
			
			int [] dp = new int[n+1];
			Arrays.fill(dp, 1 << 29);
			for(int i = -1; i < n; i++){
				
				for(int j = i+1; j < n; j++){
					int [] now = new int[26];
					boolean odd = false;
					boolean palind = true;
					for(int k = 0; k < 26; k++){
						if(i == -1){
							now[k] = acc[j][k];
						}
						else{
							now[k] = acc[j][k] - acc[i][k];
						}
						if(now[k] % 2 == 1){
							if(odd){
								palind = false;
								break;
							}
							odd = true;
						}
					}
					if(palind){
						if(i == -1){
							dp[j] = Math.min(dp[j], 1);
						}
						else{
							dp[j] = Math.min(dp[j], dp[i] + 1);
						}
						
					}
				}
			}
			System.out.println(dp[n-1]);
			
			
		}
	}



	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}

}
