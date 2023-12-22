
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int cnt=0;
		int max=Integer.MIN_VALUE;
		int prev=scn.nextInt();
		for(int i=1;i<n;i++) {
			int x=scn.nextInt();
				if(x<=prev) {
					cnt++;
					if(max<cnt) {
						max=cnt;
					}
				}
				else {
					if(max<cnt) {
						max=cnt;
					}
					cnt=0;
				}
			prev=x;
		}
		System.out.println(cnt);
	}

}
