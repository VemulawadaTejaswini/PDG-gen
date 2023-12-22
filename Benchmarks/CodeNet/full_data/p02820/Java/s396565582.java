import java.util.Scanner;


	public class Main {
		
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int k = sc.nextInt();
			int spoint = sc.nextInt();
			int ppoint = sc.nextInt();
			int rpoint = sc.nextInt();
			int[] p = new int[n];
			int ret = 0;
			
			char[] t = sc.next().toCharArray();
			
			for(int i=k;i<n;i++) {
				if(t[i]==t[i-k]) {
					t[i] = 'x';
				}
			}
			
			
			for(int i=0;i<n;i++) {
				if(t[i]=='s') {
					p[i] = spoint;
				}else if(t[i]=='p') {
					p[i] = ppoint;
				}else if(t[i]=='r') {
					p[i] = rpoint;
				}
			}
			
			
			
			for(int i=0;i<n;i++) {
				ret += p[i];
			}
			
			System.out.println(ret);
	    }
				
	}
	
