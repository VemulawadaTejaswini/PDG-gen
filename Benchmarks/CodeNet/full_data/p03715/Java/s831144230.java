import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		if(H%3==0 || W%3==0){
			System.out.println(0);
			return;
		}
		
		long s1=Long.MAX_VALUE; //├型
		for(int i=1; i<W; i++){
			long a1 = (W-i)*(long)Math.ceil((double)H/2.0);
			long a2 = (W-i)*(long)Math.floor((double)H/2.0);
			long cur = Math.max(i*H, Math.max(a1, a2)) - Math.min(i*H, Math.min(a1,a2));
			s1 = Math.min(s1, cur);
		}
			
		long s2=Long.MAX_VALUE; //┬型
		for(int i=1; i<H; i++){
			long b1 = (H-i)*(long)Math.ceil((double)W/2.0);
			long b2 = (H-i)*(long)Math.floor((double)W/2.0);
			long temp = Math.max(i*W, Math.max(b1, b2)) - Math.min(i*W, Math.min(b1,b2));
			s2 = Math.min(s2, temp);
		}
		
		long ans = Math.min(Math.min(s1, s2), Math.min(H, W));
		System.out.println(ans);
		return;
	}
}