import java.util.Scanner;


	public class Main {
		
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	        
			StringBuilder sb = new StringBuilder();
			sb.append(sc.next());
			int q = sc.nextInt();
			
			for(int i=0;i<q;i++) {
				int t = sc.nextInt();
				
				if(t==1) {
					sb.reverse();
					continue;
				}
				
				if(t==2) {
					int f = sc.nextInt();
					
					if(f==1) {
						sb.insert(0, sc.next());
						continue;
					}
					
					if(f==2) {
						sb.append(sc.next());
						continue;
					}
				}
			}
			
			System.out.println(sb);
			
		}
		
	}
