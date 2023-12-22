import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int [] a  = new int [N];
			int goukei  = 0;
			BigDecimal [] b = new BigDecimal[N];
			
			BigDecimal ans = new BigDecimal(1);
			BigDecimal go = new BigDecimal(0);
			
			for(int i = 0;i<N;i++) {
				a[i] = scan.nextInt();
			}
			
			for(int i = 0;i<N;i++) {
				BigDecimal s = new BigDecimal(a[i]);
				ans = ans.multiply(s);
				System.out.println(ans.toString());
			}
			
			ans = ans.subtract(new BigDecimal(1));//1引く
			System.out.println(ans);
			
			
			for(int i = 0;i<N;i++) {
				go = go.add(ans.remainder(new BigDecimal(a[i])));
				System.out.println(ans.remainder(new BigDecimal(a[i])));
			}
			String str = go.toString();
			 
			System.out.println(go.toString());
			
			
			
		}
		
		
	}
		

}
