import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		int a[] = new int[n];
		int x[] = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			if(i%2==1)
				x[0]-=a[i];
			if(i%2==0)
				x[0]+=a[i];
		}
		
		for(int i=1;i<n;i++) {
			x[i]=a[i-1]*2-x[i-1];
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(x[i]);
			System.out.print(" ");
		}
		

	}

}