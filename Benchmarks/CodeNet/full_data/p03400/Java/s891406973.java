import java.util.*;

class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N=sc.nextInt(),D=sc.nextInt(),X=sc.nextInt(),A[]=new int[N],sum=0;
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
			if(D%A[i]!=0)
			sum += D/A[i] +1;
			else sum+=D/A[i];
		}
		System.out.println(sum+X);
	}
}