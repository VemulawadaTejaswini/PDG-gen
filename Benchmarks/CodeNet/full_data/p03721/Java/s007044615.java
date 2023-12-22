import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int K = scan.nextInt();
			long[]a = new long[N];
			long[]b = new long[N];
			Map<Long,Long>map = new TreeMap<Long,Long>();
			for(int i = 0;i<N;i++) {
				a[i] = scan.nextLong();
				b[i] = scan.nextLong();
				if(map.containsKey(a[i])) {
					map.put(a[i], map.get(a[i])+b[i]);
				}else {
					map.put(a[i], b[i]);
				}
			}
			
			long ans = 0;
			for(Long key:map.keySet()) {
				K-=map.get(key);
				if(K<=0) {
					ans = key;
					break;
				}else if(K>0){
					ans = key;
				}
				
			}
			
			
			System.out.println(ans);
			
			
			
			
			
		}
		
		
	}
		

}
