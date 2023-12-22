import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] b = new int[n-1];
		for(int i=0;i<n-1;i++) {
			b[i]=sc.nextInt();
		}
		int[] a = new int[n];
		a[n-1]=b[n-2];
		for(int i=n-3;i>=0;i--) {
			if(b[i]>b[i+1]) {
				a[i+1] = b[i+1];
			}
			else {
				a[i+1] = b[i];
			}
		}
		a[0] = a[1];
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
 
}