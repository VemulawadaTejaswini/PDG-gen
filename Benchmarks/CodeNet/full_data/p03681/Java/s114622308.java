import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws InterruptedException {
		    Scanner sc = new Scanner(System.in);	
			
			int in = sc.nextInt();
			int im = sc.nextInt();
			System.out.println(Recounciled(in,im));

		    sc.close(); }
	
	public static long Recounciled(int n , int m) {
		long ans = 1;
		if(Math.abs(n-m) >= 2){
			ans = 0;
		}else if(Math.abs(n-m) == 1){
			for(int i = 1; i <= n; i++){
				ans = (ans * i) % (1000000007);
			}
			for(int i = 1; i <= m; i++){
				ans = (ans * i) % (1000000007);
			}
		}else{
			for(int i = 1; i <= n; i++){
				ans = (ans * i) % (1000000007);
			}
			for(int i = 1; i <= m; i++){
				ans = (ans * i) % (1000000007);
			}
			ans = (ans * 2) % (1000000007);
		}
		return ans;
	}
}
