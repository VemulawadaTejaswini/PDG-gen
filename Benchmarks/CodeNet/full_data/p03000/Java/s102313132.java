import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(),X=sc.nextInt();
		int ans=1;
		double D=0;

		for(int i=0;i<N;i++) {
			int L=sc.nextInt();
			D+=L;
			if(D<=X) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}