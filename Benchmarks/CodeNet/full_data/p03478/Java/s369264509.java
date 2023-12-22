
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum1=0,ans=0;
		
		for(int i=1; i<=n; i++) {
		
				sum1=i/10000+(i%10000)/1000+(i%1000)/100+(i%100)/10+i%10;
			
			if(sum1>=a && sum1<=b) {
				ans=ans+i;
			}
		}
		System.out.println(ans);

	}

}
