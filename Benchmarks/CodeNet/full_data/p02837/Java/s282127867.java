import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 0;
		Map<Integer,Integer>[] list = new Map[N];
		for(int i = 0;i < N;i++){
			int A = sc.nextInt();
			Map<Integer,Integer> maps = new HashMap<>();
			for(int j = 0;j < A;j++){
				int x = sc.nextInt() - 1;
				int y = sc.nextInt();
				maps.put(x,y);
			}
			list[i] = maps; 
		}
		for(int i = 0;i < 1<<N;i++){
			boolean flg = true;
			int[] people = new int[N];
			int buf = 0;
			for(int j = 0;j < N;j++){
				if((1 & i>>j) == 1){
					people[j] = 1;
					buf++;
				}
			}
			for(int j = 0;j < N;j++){
				if(people[j] == 1){
					for(int key : list[j].keySet()){
						if(people[key] != list[j].get(key)){
							flg = false;
						}
					}
				}
			}
			if(flg){
				ans = Math.max(ans,buf);
			}
		}
		System.out.println(ans);
	}
}