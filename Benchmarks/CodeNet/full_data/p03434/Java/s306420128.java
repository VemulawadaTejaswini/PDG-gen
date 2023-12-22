import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		Integer a[]=new Integer[N];
		int i;
		int sum=0;
		for(i=0;i<N;++i) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a,Comparator.reverseOrder());
		if(N%2==0) {
			for(i=0;i<N/2;++i) {
				sum+=(a[2*i]-a[2*i+1]);
			}}
		if(N%2==1) {
			for(i=0;i<N/2;++i) {
			sum+=(a[2*i]-a[2*i+1]);}
			sum+=a[N-1];
		}
			
			System.out.println(sum);
			
		
	}

}
