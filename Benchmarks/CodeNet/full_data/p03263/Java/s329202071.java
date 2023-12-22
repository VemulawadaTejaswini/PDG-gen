import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strs = br.readLine().split(" ");
		int h = Integer.parseInt(strs[0]);
		int w = Integer.parseInt(strs[1]);
		boolean[][] map = new boolean[h][w];
		for(int i = 0 ; i < h ; i++){
			strs = br.readLine().split(" ");
			for(int j = 0 ; j < w ; j++){
				map[i][j] = Integer.parseInt(strs[j]) % 2  == 1;
			}
		}
		
		ArrayList<String> result = new ArrayList<String>();
		
		int j1 = 0;
		L1:for(int i = 0 ; i < h ; i++){
			while(!map[i][j1]){
				j1++;
				if(j1 >= w){
					j1 = 0;
					continue L1;
				}
			}
			int j2 = j1 +1;
			if(j2 >= w){
				if(i+1 < h){
					map[i][j1] = false;
					map[i+1][j1] = !map[i+1][j1];
					result.add((i+1)  + " " + (j1+1) + " " + (i+1+1) + " " + (j1+1));
				}
				j1 = 0;
				continue L1;
			}
			while(!map[i][j2]){
				j2++;
				if(j2 >= w){
					if(i+1 < h){
						map[i][j1] = false;
						map[i+1][j1] = !map[i+1][j1];
						result.add((i+1)  + " " + (j1+1) + " " + (i+1+1) + " " + (j1+1));
					}
					j1 = 0;
					continue L1;
				}
			}
			
			for(int m = j1 ; m < j2 ; m++){
				result.add((i+1)  + " " + (m+1) + " " + (i+1) + " " + (m+1+1));
			}
			
			map[i][j1] = false;
			map[i][j2] = false;
			j1 = j2;
			i--;
			continue L1;
		}
		/*
		for(int i = 0 ; i < h ; i++){
			for(int j = 0 ; j < w ; j++){
				System.out.print(map[i][j]?"x":"o");
			}
			System.out.println();
		}*/
		
		System.out.println(result.size());
		for(String s:result){
			System.out.println(s);
		}
	}
}
