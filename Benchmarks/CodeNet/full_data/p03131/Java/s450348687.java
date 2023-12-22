import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long K=sc.nextLong();
		long A=sc.nextLong();
		long B=sc.nextLong();

		if(A>=B) {
			pl((K+1));		//ビスケットを交換しないでそのままため続けたほうが良い
			//最初に1枚持っている
			System.exit(0);
		}
		else if(A<B) {	//交換したほうがお得なとき
			long res=K-A;
			long ans=(B-A)*((res)/2)+A;
			if(res%2==0) {
				pl(ans);
				System.exit(0);
			}
			else {
				ans=(B-A)*(1+(res)/2)+A;
				pl(ans);
				System.exit(0);
			}
		}
	}
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
	}
}