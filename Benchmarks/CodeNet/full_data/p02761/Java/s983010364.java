import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Map<Integer,Integer> map = new TreeMap<>();
		for(int i = 0;i < M;i++){
			int s = sc.nextInt();
			int c = sc.nextInt();
			if(map.containsKey(s) && map.get(s)!=c){
				System.out.println(-1);
				return;
			}else{
				map.put(s-1, c);
			}
		}
 		sc.close();
 		for(int i = 0;i < N;i++){
 			if(!map.containsKey(i)){
 				map.put(i, 0);
 				if(i == N-1){
 					System.out.println(-1);
 					return;
 				}
 			}
 		}
 		for(Map.Entry<Integer, Integer> ent : map.entrySet()){
 			System.out.print(ent.getValue());
 		}
	}
}
