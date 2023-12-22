
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int a[]=new int[N];
		int d[]=new int[N];
		int tmp1=0;
		int tmp2=N/2;
		if(N%2==1) {
			tmp1=N/2+1;
		}else {
			tmp1=N/2;
		}
		int b[]=new int[tmp1];
		int c[]=new int[tmp2];
		for (int i = 0; i < N; i++) {
			a[i] = in.nextInt();
		}
		Arrays.sort(a);
		for(int i = 0; i < N; i++) {
			if(i<tmp1) {
				b[i]=a[i];
			}else {
				c[i-tmp1]=a[i];
			}
		}
		//
		if(N%2==0) {
			d[0]=b[tmp1-1];
			for(int i = 1; i < N; i++) {
				if(i%2==1) {
					d[i]=c[tmp2-1-i/2];
				}else{
					d[i]=b[i/2-1];
				}
			}
			
			long sum=0;
			
			for(int i = 0; i < N-1; i++) {
				sum=sum+Math.abs(d[i]-d[i+1]);
			}
			System.out.print(sum);
		}
		
		if(N%2==1) {
			d[0]=b[tmp1-1];
			for(int i = 1; i < N; i++) {
				if(i%2==1) {
					d[i]=c[tmp2-1-i/2];
				}else{
					d[i]=b[i/2-1];
				}
			}
			long sum=0;
			long sum2=0;
			long sum3=0;
			long sum4=0;
			long sum5=0;
			long sum6=0;
			long sum7=0;
			long sum8=0;
			for(int i = 0; i < N-1; i++) {
				sum=sum+Math.abs(d[i]-d[i+1]);
			}
			for(int i = 1; i < N; i++) {
				if(i%2==1) {
					d[i]=b[tmp2-1-i/2];
				}else{
					d[i]=c[i/2-1];
				}
			}			
			for(int i = 0; i < N-1; i++) {
				sum2=sum2+Math.abs(d[i]-d[i+1]);
			}
			//3
			for(int i = 1; i < N; i++) {
				if(i%2==1) {
					d[i]=b[tmp2-1-i/2];
				}else{
					d[i]=c[tmp1-i/2-1];
				}
			}			
			for(int i = 0; i < N-1; i++) {
				sum3=sum3+Math.abs(d[i]-d[i+1]);
			}
			//4
			for(int i = 1; i < N; i++) {
				if(i%2==1) {
					d[i]=c[tmp2-1-i/2];
				}else{
					d[i]=b[tmp1-i/2-1];
				}
			}
			for(int i = 0; i < N-1; i++) {
				sum4=sum4+Math.abs(d[i]-d[i+1]);
			}
			//5

			//6
			//7
			//8
			
			long max=Math.max(Math.max(sum, sum2),Math.max(sum3, sum4));
			
			System.out.print(max);
			
			
		}
		
	}
}
