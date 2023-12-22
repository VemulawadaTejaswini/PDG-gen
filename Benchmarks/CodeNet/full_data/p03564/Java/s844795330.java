import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int k= scan.nextInt();
		scan.close();

		int sum=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			int x=1;
			if(i!=0)x=x*(int)(Math.pow(2, i));
			else x=1;
			for(int j=0;j<n-i;j++) {
				x+=k;

			}
			if(sum>x)sum=x;
		}
		System.out.println(sum);
	}
}