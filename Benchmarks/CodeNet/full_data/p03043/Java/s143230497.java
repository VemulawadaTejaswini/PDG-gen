import java.util.Scanner;
 
public class Main{
		
	public static void main(String args[]){
		  
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int score = 0;
		double pro = 0;
		double ans = 0;
		for(int i = 1; i <= n; i++) {
			score = i;
			if(i >= k) {
				ans += 1/n;
			}else {
				int cn = Math.abs(k-n);
				for(int j = 1; j <= cn; j++) {
					if(score*Math.pow(2, j) >= k) {
						ans += Math.pow(0.5, j);
						break;
					}
				}				
			}
		}
		
		System.out.println(ans);
		
	}
}
