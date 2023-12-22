import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int n=N;
		int sum=0;
		int a[]=new int[8];
		for(int i=0;i<8;i++) {
			a[i]=n%10;
			n=n/10;
			sum+=a[i];
		}
		if(N%sum==0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}
