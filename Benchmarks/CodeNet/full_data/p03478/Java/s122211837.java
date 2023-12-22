import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum1=0,ans=0,cnt1=1;
		if(n>=100) cnt1=2;
		if(n>=1000) cnt1=3;
		if(n>=10000) cnt1=4;
		for(int i=1; i<=n; i++) {
			if(cnt1==1) {
			  sum1=i/10+i%10;
			} else if(cnt1==2) {
				sum1=i/100+(i%100-i%10)/10+i%10;
			} else if(cnt1==3) {
				sum1=i/1000+(i%1000-i%100)/10+(i%1000-i%100-i%10)/10+i%10;
			} else if(cnt1==4) {
				sum1=i/10000+(i%10000-i%1000)/10+(i%1000-i%100)/10+(i%1000-i%100-i%10)/10+i%10;
			}
			if(sum1>=a && sum1<=b) {
				ans=ans+i;
			}
		}
		System.out.println(ans);

	}

}