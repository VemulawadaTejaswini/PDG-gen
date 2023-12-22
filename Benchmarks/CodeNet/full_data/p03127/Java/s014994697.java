import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),g=sc.nextInt();
		for(int i=1;i<n;i++) {
			int temp = sc.nextInt();
			g=gcd(temp,g);
		}
		sc.close();
		System.out.println(g);
	}

	static int gcd(int a, int b) {
		if(a<b) {
			int temp=b;
			b=a;
			a=temp;
		}
		int r=a%b;
		while(r!=0) {
			a=b;
			b=r;
			r=a%b;
		}
		return b;
	}
}