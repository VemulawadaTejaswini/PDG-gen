import java.util.Scanner;
public class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int K=sc.nextInt();
		int X=sc.nextInt();
		sc.close();
		int min=Math.max(X-K+1, -1000000);
		int max=Math.min(X+K-1, 1000000);
		for(int i=min;i<=max;i++) {
			System.out.print(i+" ");
		}
	}
}