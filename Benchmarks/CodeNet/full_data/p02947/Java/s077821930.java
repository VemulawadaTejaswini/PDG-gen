import java.util.Arrays;
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
			
			int ret = 0;
			
			
			for(int i=0;i<n;i++) {	
				for(int j=i+1;j<n;j++) {
					if(S[i].equals(S[j])) {
						ret++;
					}
				}
			}
			
			
			System.out.println(ret);
		}
		
	}
