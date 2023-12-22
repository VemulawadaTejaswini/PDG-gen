import java.util.*;
public class Main{
	public static void main(String[] args){
		long ans = 0;
		Scanner sc = new Scanner(System.in);
		long k = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		ans = k+1;
		if(b-a > 2){
			long time = a+2;
			while(time <= k+1){
				ans += b-a-2;
				time += 2;
			}
		}
		
		System.out.println(ans);
	}
}
