import java.util.*;
import static java.lang.Math.ceil;
class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		long n = input.nextLong();
		long k = input.nextInt();
		Vector h = new Vector();
		for(int i = 0;i < n; ++i){
			long x  = input.nextInt();
			h.add(x);
		}
		long ans = 0;
		Collections.sort(h);
		Collections.reverse(h);
		for(int i = 0;i < n; ++i){
			if(k > 0){
				k--;
			}else{
				ans += (long)h.elementAt(i);
			}
		}
		System.out.println(ans);
	}
}