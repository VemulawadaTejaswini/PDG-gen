import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		long k = sc.nextLong();
		int keta_100 = s/100;
		int keta_10 = (s%100)/10;
		int keta_1 = (s%10);

		int ans = keta_100;
		long five = 5000000000000L;
		k = k - keta_100 * five;
		if(k>0){
			ans = keta_10;
			k = k - keta_10 * five;
			if(k>0){
				ans = keta_1;
			}
		}
		System.out.println(ans);
	}
}