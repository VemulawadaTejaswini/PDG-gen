import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int H=sc.nextInt();
		int W=sc.nextInt();
		int A=sc.nextInt();
		int B=sc.nextInt();
			int i=0;
			for(;i<B;i++) {
				int j=0;
				for(j=0;j<A;j++)System.out.print(0);
				for(;j<W;j++)System.out.print(1);
				System.out.println();
			}
			for(;i<H;i++) {
				int j=0;
				for(j=0;j<A;j++)System.out.print(1);
				for(;j<W;j++)System.out.print(0);
				System.out.println();
			}
	}

}
