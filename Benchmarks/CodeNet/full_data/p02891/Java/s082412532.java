import java.util.Scanner;


	public class Main {
		
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			char[] s = sc.next().toCharArray();
			long k = sc.nextLong();
			long count = 0;
			int n = s.length;
			
			for(int i=0;i<n-1;i++) {
				if(s[i]==s[i+1]) {
					s[i+1]='A';
					count++;
				}
			}
			
			if(s[0]==s[n-1]) {
				System.out.println(count*k+(k-1));
			}else {
				System.out.println(count*k);
			}
			
	    }
		
	}
	
