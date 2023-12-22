import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String ns = s.nextLine();	
		
		String []aa = ns.split("\\s");
		
		int N = Integer.parseInt(aa[0]);
		
		int K = Integer.parseInt(aa[1]);
		
		int Q = Integer.parseInt(aa[2]);
		
		int p[] = new int[N];
		for(int i=0;i<N;i++) {
			p[i] = K;
		}
		
		for(int i=0;i<Q;i++) {
			String str = s.nextLine();
			
			int n = Integer.parseInt(str);
			
			for(int j=0;j<N;j++) {
				if(n == (j+1)) {
					
				} else {
					p[j] = p[j]-1;
				}
				
			}
		}
		
		for(int i=0;i<N;i++) {
			if(p[i]<=0) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}
		}
		

	}

}