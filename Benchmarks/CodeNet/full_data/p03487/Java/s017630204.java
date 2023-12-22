import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


	public class Main {
		
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	        
			int n = sc.nextInt();
			int a;
			int ans = 0;
			
			Map<Integer,Integer> m = new TreeMap<Integer,Integer>();
			
			for(int i=0;i<n;i++) {
				a = sc.nextInt();
				m.merge(a, 1, Integer::sum);
			}
			
			for(Map.Entry<Integer, Integer> e : m.entrySet()){
				int key = e.getKey();
				int value = e.getValue();
				
				if(key==value) {
					continue;
				}else if(key>value) {
					ans += value;
				}else {
					ans += (value-key);
				}
			}
			
			System.out.println(ans);
		}
	}
