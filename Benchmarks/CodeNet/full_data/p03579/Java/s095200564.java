import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		String[] spl = br.readLine().split(" ");
		int n = Integer.parseInt(spl[0]);
		int m = Integer.parseInt(spl[1]);
		int map[][] = new int[n][n];
		for(int i = 0 ; i < n ; i++){
			for(int j = 0 ; j < n ; j++){
				map[i][j] = -1;
			}
		}
		for(int i = 0 ; i < m ; i++){
			spl = br.readLine().split(" ");
			int a = Integer.parseInt(spl[0])-1;
			int b = Integer.parseInt(spl[1])-1;
			map[a][b] = 1;
			map[b][a] = 1;
		}
		int cnt = -1;
		int cnt1 = 0;
		while(cnt != cnt1){
			cnt = cnt1;
			for(int i = 0 ; i < n ; i++){
				for(int j = 0 ; j < n-i ; j++){
					if(map[j][i] == 1){
						for(int k = 0 ; k < n ; k++){
							if(map[k][j] == 1 && i != k){
								for(int l = 0 ; l < n ; l++){
									if(map[l][k] == 1 && i != l && j != l && map[i][l] ==-1
											&& i != k ){
										map[i][l] =1;
										map[l][i] =1;
										map[j][i] =-1;
										cnt1++;
									}
								}
							}
						}
					}
				}
			}
		}
			System.out.println(cnt);
	}
}