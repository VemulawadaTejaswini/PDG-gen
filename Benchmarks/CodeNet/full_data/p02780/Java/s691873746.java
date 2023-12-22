import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),k=sc.nextInt();
		int[] p_array = new int[n];
		double[] ex = new double[1001];
		for(int i=0;i<n;i++) 	p_array[i]=sc.nextInt();
		for(int i=2;i<1001;i++) ex[i] = (double)(i+1)/2;
		double sum=0;
		for(int i=0;i<k;i++) sum+=ex[p_array[i]];
		double max=sum;
		for(int top=0;top+k<=n;top++) {
			sum-=ex[p_array[top]];
			sum+=ex[p_array[top+k-1]];
			if(sum>=max) max=sum;
		}
		System.out.printf("%.10f\n",max);
	}
}