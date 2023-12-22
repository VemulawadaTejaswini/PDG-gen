import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int[]H = new int[N];
			int[]count = new int[N];
			
			
			for(int i =0;i<N;i++) {
				H[i] = scan.nextInt();
			}
			
			int chakuti=0;
			int genzai =0;
			
			
			while(true) {
				if(genzai==N-1) {
					break;
				}
				
				if(H[genzai]>=H[genzai+1]) {//順に小さいところにはカウントする必要がない
					count[chakuti]+=1;
					genzai++;
				}else if(H[genzai]<H[genzai+1]) {
					chakuti=genzai+1;
					genzai++;
				}
				
				
				
				
				
				
				
			}
			
			
			int max = 0;
			for(int i = 0;i<N;i++) {
				if(max<count[i]) {
					max = count[i];
				}
			}
			
			
			System.out.println(max);
			
			
			
			
		}
		
		
	}
		

}
