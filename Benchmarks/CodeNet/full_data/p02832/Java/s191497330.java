
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int c=0;
		int j=1;
		for(int i=0;i<n;i++) {
			if(j==a[i]) {
				j++;
			}else {
				c++;
			}
		}
		if(n==c)
			System.out.println(-1);
		else
			System.out.println(c);



	}

}
