import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),x=sc.nextInt();
		int min =1500;
		int ans=n;

		for(int i=0;i<x;i++) {
			int m=sc.nextInt();
			x-=m;
			if(min>m) {
				m=min;
			}
		}
		ans+=x/min;
		System.out.println(ans);
	}
}