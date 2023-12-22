import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			String S = sc.next();
			char[] s = S.toCharArray();
			
			long ret=0;
			
			for(int i=0;i<s.length;i++) {
				if(s[i]=='B') {
					for(int j=i+1;j<s.length;j++) {
						if(s[j]=='W') {
							ret++;
						}
					}
				}
				
			}
			
			
			System.out.println(ret);
		}	
	}