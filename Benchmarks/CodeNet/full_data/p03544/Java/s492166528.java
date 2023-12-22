import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N=sc.nextInt();
		long L0=2,L1=1;
		Long ans=0L;
		if(N==1) {
			System.out.println(L1);
		}else {
			for(int i=2;i<=N;i++) {
				ans=L0+L1;
				L0=L1;
				L1=ans;
			}
			System.out.println(ans);
		}
	}
}