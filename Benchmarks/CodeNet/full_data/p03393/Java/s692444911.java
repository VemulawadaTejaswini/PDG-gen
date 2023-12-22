import java.util.Scanner;


	public class Main {
		
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			String S = sc.next();
			char[] s = S.toCharArray();
			char[] c = new char[26];
			int n = s.length;
			char lastc = 'X';
			
			
			for(int i=0;i<n;i++) {
				c[(s[i]-'a')]++;
			}
			
			if(S.equals("zyxwvutsrqponmlkjihgfedcba")){
				System.out.println(-1);
				return;
			}
			
			if(n<26) {
				for(int i=0;i<26;i++) {
					if(c[i]==0) {
						lastc = (char)(i+97);
						break;
					}
				}
				
				System.out.print(S);
				System.out.print(lastc);
				return;
			}
			
			int count = 0;
			for(int i=n-1;i>=0;i--) {
				count = i;
				
				for(int j=s[i]-'a'+1;j<26;j++) {
					if(c[j]==0) {
						lastc = (char)(j+97);
						break;
					}
				}
				
				c[(s[i]-'a')] = 0;
				
				if(lastc!='X') {
					break;
				}
			}
			
			for(int i=0;i<count;i++) {
				System.out.print(s[i]);
			}
			System.out.println(lastc);
	    }
		
	}
	
