import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

//		run();

		Scanner scanner=new Scanner(System.in);

		long n=scanner.nextLong();

		int a=(int)Math.sqrt(n);//切り捨て。

		int b=0;

		for(int i=a; i > 0;i--) {

			if(n%i==0) {
				a=i;
				b=(int)(n/a);
				break;
			}

		}

		int result=Math.max(String.valueOf(a).length(), String.valueOf(b).length());

		System.out.println(result);

		scanner.close();

	}

//	public static void run() {
//
//		for(int i=0;i<100000;i++) {
//			System.out.println("n= "+i+"sqrt(n)= "+Math.sqrt(i)+"(int) "+(int)Math.sqrt(i));
//		}
//	}
}
