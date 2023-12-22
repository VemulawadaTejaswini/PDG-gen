import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int max=0;
		int c=0;
		for(int i=0;i<n-1;i++) {
			c=0;

			for(int j=i;j<n-1;j++) {
				if(a[j]>=a[j+1]) {
					c++;
				}else {
					i=j;
					break;
				}

			}
			max=Math.max(max, c);

		}
		System.out.println(max);

	}

}