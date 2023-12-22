import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			String S = sc.next();
			char[] s = S.toCharArray();
			int L = s.length;
			for(int i=1;i<=L;i++) {
				if((L-i)%2==0) {
					int eq=0;
					for(int j=0;j<(L-i)/2;j++) {
						if(s[j]==s[j+((L-i)/2)]) {
							eq++;
						}
					}
					if(eq==(L-i)/2) {
						System.out.println(L-i);
						return;
					}
				}
				
			}
			
		}	
	}