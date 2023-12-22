import java.util.Scanner;


	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			int n = sc.nextInt();
			int[] d = new int[n];
			int maxd = 0;
			for(int i=0;i<n;i++) {
				d[i] = sc.nextInt();
				maxd = Math.max(maxd, d[i]);
			}
			
			int m = sc.nextInt();
			int[] t = new int[m];
			int maxt = 0;
			for(int i=0;i<m;i++) {
				t[i]= sc.nextInt();
				maxt = Math.max(maxt, t[i]);
			}
			
			int maxi = Math.max(maxd, maxt);
			
			int[] difd = new int[maxi+1];
			
			for(int i=0;i<n;i++) {
				difd[d[i]]++;
			}
			for(int i=0;i<m;i++) {
				if(!(difd[t[i]]>0)){
					System.out.println("NO");
					return;
				}
				difd[t[i]]--;
			}
			
			System.out.println("YES");
			
		}
		
		
		
	}
