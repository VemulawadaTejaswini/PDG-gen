import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


	public class Main {
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	        
			int n = sc.nextInt();
			
			String[] S = new String[n];
			
			for(int i=0;i<n;i++) {
				char[] s = sc.next().toCharArray();
				Arrays.sort(s);
				String str = new String(s);
				S[i] = str;
				
			}
			
			Arrays.sort(S);
			int ret = 0;
			Map<String,Integer> m = new HashMap<String,Integer>();
			
			for(int i=0;i<n;i++) {
				m.merge(S[i], 1, Integer::sum);
			}
			
			for(Map.Entry<String, Integer> e:m.entrySet()) {
				ret+=e.getValue()*(e.getValue()-1)/2;
			}
			
			System.out.println(ret);
		}
		
	}
