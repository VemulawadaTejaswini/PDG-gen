import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] t=new int[n];
		int[] x=new int[n];
		int[] y=new int[n];
		for(int i=0;i<n;i++) {
			t[i]=sc.nextInt();
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(i!=0) {
				if(t[i]-t[i-1]<Math.abs(x[i]-x[i-1])+Math.abs(y[i]-y[i-1])) {
					System.out.println("No");
					System.exit(0);
				}
				if((t[i]-t[i-1]-(Math.abs(x[i]-x[i-1])+Math.abs(y[i]-y[i-1])))%2!=0) {
					System.out.println("No");
					System.exit(0);
				}
			}else {
				if(t[i]<x[i]+y[i]) {
					System.out.println("No");
					System.exit(0);
				}
				if((t[i]-(x[i]+y[i]))%2!=0) {
					System.out.println("No");
					System.exit(0);
				}
				
			}
		}
		
		System.out.println("Yes");
	}
}

