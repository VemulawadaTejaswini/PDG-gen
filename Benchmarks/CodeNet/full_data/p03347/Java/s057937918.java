import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];

		int kosuu=0;

		a[0]=sc.nextInt();
		if(a[0]!=0) {
			System.out.print(-1);
		}
		else {
			for(int i=1;i<n;i++) {
				a[i]=sc.nextInt();

				if(a[i]>0) {
					kosuu++;
				}

				if(a[i]==a[i-1]) {
					kosuu+=a[i]-1;
				}

				if(a[i]-a[i-1]>1||a[i]-a[i-1]<0&&(a[i]!=0&&a[i]!=1)) {
					kosuu=-1;
					break;
				}

			}

			System.out.print(kosuu);
		}

	}

}
