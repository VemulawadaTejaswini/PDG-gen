import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main{
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int K = scan.nextInt();
			int[]a = new int[N];
			int[]b = new int[N];
			Map<Integer,Integer>map = new TreeMap<Integer,Integer>();
			for(int i = 0;i<N;i++) {
				a[i] = scan.nextInt();
				b[i] = scan.nextInt();
				if(map.containsKey(a[i])) {
					map.put(a[i], map.get(a[i])+b[i]);
				}else {
					map.put(a[i], b[i]);
				}
			}
			
			int ans = 0;
			for(Integer key:map.keySet()) {
				K-=map.get(key);
				if(K<=0) {
					ans = map.get(key);
					break;
				}else if(K>0){
					ans = map.get(key);
				}
				
			}
			
			
			System.out.println(ans);
			
			
			
			
			
		}
		
		
	}
		

}
