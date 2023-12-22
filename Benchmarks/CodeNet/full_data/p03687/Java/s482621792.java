import java.util.HashSet;
import java.util.Scanner;


	public class Main {
		
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			char[] s = sc.next().toCharArray();
			HashSet<Character> m = new HashSet<Character>(); 
			
			for(int i=0;i<s.length;i++) {
				m.add(s[i]);
			}
			
			if(m.size()==1) {
				System.out.println(0);
				return;
			}
			
			int ret = Integer.MAX_VALUE ;
			
			
			for(Character c : m) {
				int n = s.length;
				int count = 0;
				char[] t = new char[n];
				for(int j=0;j<n;j++) {
					t[j] = s[j];
				}
				while(true) {
					
					HashSet<Character> set = new HashSet<Character>();
					for(int i=0;i<n-1;i++) {
						 
						if(t[i+1]==c) {
							t[i]=c;
						}
						set.add(t[i]);
					}
					count++;
					n--;
					if(set.size()==1) {
						break;
					}
					set.clear();
				}
				ret = Math.min(ret, count);
				
			}
			
			
			
			System.out.println(ret);
	    }
				
	}
	
