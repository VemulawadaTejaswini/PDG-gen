import java.math.BigInteger;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		long k=sc.nextLong();
		long ca=0;
		long cb=0;
		if(k<a) {
			ca=a-k;
			cb=b;
		}
		else {
			k=k-a;
			if(k<b) {
				cb=b-k;
				
			}
			else {
				ca=0;
				cb=0;
			}
		}
		System.out.println(ca+" "+cb);
	}
}