import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] ans = new int[n];
		HashMap<Integer, Integer> map = new HashMap<>();
		int[][] brr = new int[m][2];
		for(int i = 0; i < m; i++){
			for(int j = 0; j < 2; j++){
				brr[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < m; i++){
			if(brr[i][1] != 0){
			if(map.containsKey(brr[i][0])){
				map.put(brr[i][0], Math.min(map.get(brr[i][0]), brr[i][1]));
			}else
				map.put(brr[i][0],brr[i][1]);
			}
		}
		//System.out.println(map);
		if(map.size() == 3){
			ans[0] = map.get(1);
			ans[1] = map.get(2);
			ans[3] = map.get(3);
			for(int i = 0; i < 3; i++){
					System.out.print(ans[i]);
				}
		}else if(map.size() == 2){
			if(map.containsKey(1)){
				ans[0] = map.get(1);
				if(map.containsKey(2)){
					ans[1] = map.get(2);
					if(map.containsKey(3)){
						ans[2] = map.get(3);
					}else{
						ans[2] = 0;
					}
				}else{
					ans[1] = 0;
					if(map.containsKey(3)){
						ans[2] = map.get(3);
					}else{
						ans[2] = 0;
					}
				}
				for(int i = 0; i < 3; i++){
					System.out.print(ans[i]);
				}
				}
				else{
					System.out.println("-1");
				}
			}
			else if(map.size() == 1){
				if(map.containsKey(1)){
					ans[0] = map.get(1);
					ans[1] = 0;
					ans[2] = 0;
					for(int i = 0; i < 3; i++){
					System.out.print(ans[i]);
				}
				}else{
					System.out.println("-1");
				}
			}
			else{
				System.out.println("-1");
			}
		
	}
	
	}