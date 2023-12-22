import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int a=1;
		if(X==1) {
			System.out.println(a);
			System.exit(0);
		}
		for(int i=2;i*i<=X;i++) {
			for(int k=1;(int)Math.pow(i, k)<=X;k++) {
				if((int)Math.pow(i, k)>a) {
					a=(int)Math.pow(i, k);
				}
			}
		}
		System.out.println(a);
	}
}