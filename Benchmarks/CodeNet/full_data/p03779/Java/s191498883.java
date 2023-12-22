import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int X = scan.nextInt();
			
			
			
			int n = 1;
			while(true) {
				if(X==(n*(n+1))/2) {//ぴったり一致したらそこで終了。
					System.out.println(n);
					System.exit(0);
				}
				
				if(X<(n*(n+1))/2) {//超えたら終了。
					break;
				}
				n++;
				//System.out.println(n);
			}
			int k = n;
			boolean tan = false;
			int turn = 0;
			
			while(true) {
				if((k+1)*k/2-X<n+1) {
					n++;
				}else
				if((k+1)*k/2-X==n+1) {
					tan = true;
					turn = n+1;
				}else
				if((k+1)*k/2-X>n+1) {
					break;
				}
				
			}
			
			//ここ以降のｎは
			if(tan) {
				System.out.print(X-((n-2)*(n-1))/2<turn?X-((n-2)*(n-1))/2:turn);
			}else {
				System.out.print(X-((n-2)*(n-1))/2);
			}
			
			
			
			
		}
		
		
	}
		

}
