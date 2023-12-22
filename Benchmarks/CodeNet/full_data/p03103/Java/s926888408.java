import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int M = scan.nextInt();
			long[]a = new long[N];
			long[]b = new long[N];
			Map<Long,Long>map = new TreeMap<Long,Long>();
			for(int i = 0;i<N;i++) {
				a[i] = scan.nextLong();
				b[i] = scan.nextLong();
				map.put(a[i], b[i]);
			}
			 
			Object[]mapk = map.keySet().toArray();
			Arrays.sort(mapk);

			
			long goukei = 0;
			for(Long key:map.keySet()) {
				//System.out.print(key);
				//System.out.print(" ");
				//System.out.println(map.get(key));
				if(M>map.get(key)) {
					M-=map.get(key);
					goukei+=map.get(key)*key;
				}else {
					goukei+=key*M;
					M=0;
					break;
				}
			}
			
			System.out.println(goukei);
			
			
			
			
			
			
			
		}
		
		
	}
		

}
