
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		int[] d=new int[n];
		for(int i=0;i<n;i++) {
			d[i]=sc.nextInt();
		}
		System.out.println(Takoyaki(d));

	}

	private static int Takoyaki(int[] d) {
		int r=0;

		r=(Sum(d)*Sum(d)-Sum(SquareEach(d)))/2;
		return r;
	}

	private static int[] SquareEach(int[] d) {
		int[] r=new int[d.length];
		for(int i=0;i<d.length;i++) {
			r[i]=d[i]*d[i];
		}
		return r;
	}

	private static int Sum(int[] d) {
		int r=0;
		for(int i=0;i<d.length;i++) {
			r=r+d[i];
		}
		return r;
	}

}