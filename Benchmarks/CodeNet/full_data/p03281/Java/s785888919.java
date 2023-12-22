import java.util.Scanner;
public class Main {
	public static int C(int i) {
		int ans=0;
		for(int j=1;j<=i;j++) {
			if(i%j==0) {
				ans++;
			}
		}
		return ans==8&&i%2==1?1:0;
	}
public static void main(String[]srgs) {
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int ans=0;
	for(int i=0;i<=a;i++) {
		ans+=C(i);
	}
	System.out.println(ans);
}
}