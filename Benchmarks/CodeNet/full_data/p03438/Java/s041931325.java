import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		while(true) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		int[] d=new int[n];
		int e=0;
		long sa=0;
		long sb=0;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			sa+=a[i];
		}
		for(int i=0;i<n;i++) {
			b[i]=sc.nextInt();
			sb+=b[i];
			d[i]=b[i]-a[i];
			if(d[i]>0)e+=(d[i]+1)/2;
		}
		long c=sb-sa;
		if(c<e) {
			System.out.println("No");
		}
		else {
			System.out.println("Yes");
		}
		}
	}
	}
