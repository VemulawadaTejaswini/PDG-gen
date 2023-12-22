import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int[] A=new int[N];
		int x=(int)(Math.log(Math.pow(10, 9))/Math.log(2));
		//System.out.println(x);
		//System.out.println(Math.pow(2,x));
		int a[]=new int[x+1];
		for(int i=0;i<x+1;i++) {
			a[i]=0;
		}
		//System.out.println(x);
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
			int b=(int)(Math.log(A[i])/Math.log(2));
			a[b]++;
			//System.out.println(b);
		}
		Arrays.sort(A);
		int count=0;
		for(int i=x+1;i>0;i--) {
			int m=0;
			for(int j=x+1;j>=i;j--) {
				m+=a[j-1];
			}
			for(int j=0;j<m;j++) {
				A[N-1-j]=A[N-1-j]/2;
				count++;
				if(count==M) {
					break;
				}
			}
			if(count==M) {
				break;
			}
			Arrays.sort(A);
		}
		int sum=0;
		for(int i=0;i<N;i++) {
			sum+=A[i];
			//System.out.println(A[i]);
		}
		System.out.println(sum);
	}
}
