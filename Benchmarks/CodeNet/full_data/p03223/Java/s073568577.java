import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int A[]=new int[N];
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}
		Arrays.sort(A);
		int sum=0;
		for(int i=0;i<N-1;i++) {
			
			sum=sum+Math.abs(A[i]-A[i+1]);
			
		}
		System.out.println(sum);
	}

}
