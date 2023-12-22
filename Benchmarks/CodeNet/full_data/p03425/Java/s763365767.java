import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


	public class Main {
		
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	        
			int n = sc.nextInt();
			Map<Character,Integer> m = new HashMap<Character,Integer>();
			
			for(int i=0;i<n;i++) {
				char[] s = sc.next().toCharArray();
				m.merge(s[0], 1, Integer::sum);
			}
			
			int[] num = new int[5];
			char[] march = "MARCH".toCharArray();
			int sum = 0;
			int kind = 0;
			int subst = 0;
			
			for(int i=0;i<5;i++) {
				if(m.containsKey(march[i])) {
					num[i] = m.get(march[i]);
				}
				if(num[i]>0) {
					kind++;
				}
				sum += num[i];
			}
			
			for(int i=0;i<5;i++) {
				if(num[i]>0) {
					subst += num[i]*(num[i]-1)/2*(kind-1);
				}
				if(num[i]>=3) {
					subst += num[i]*(num[i]-1)*(num[i]-2)/6;
				}
			}
			
			int ret = sum*(sum-1)*(sum-2)/6-subst;
			
			System.out.println(ret);
		}
		
	}
