
import java.util.Arrays;
import java.util.Scanner;
public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		long A[]=new long[N];
		long B[]=new long[N];
		long C[]=new long[N];
		for(int i=0;i<N;i++) {
			A[i]=sc.nextLong();
		}
		for(int i=0;i<N;i++) {
			B[i]=sc.nextLong();
		}
		for(int i=0;i<N;i++) {
			C[i]=sc.nextLong();
		}
		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);
		long ans=0;
		for(int i=0;i<N;i++) {
			if(A[0]>B[i]) {
				continue;
			}else {
			ans+=(search(0,N-1,A,B[i],false)+1)*(N-search(0, N-1,C,B[i],true)-1);
			//System.out.println(search(0,N-1,A,B[i],false)+1+" "+(N-search(0, N-1,C,B[i],true)-1));
		}
		}
		System.out.println(ans);
		}

	public static int search(int left,int right,long array[],long Bnow,boolean flag) {
		int center=(right+left)/2;

		if(left==right) {
			if(flag) {
				while(array[center]<=Bnow) {
					center++;
					if(center==array.length) {
						return center-1;
					}
				}
				return center-1;
			}else {
				while(array[center]>=Bnow) {
					center--;
				}
				return center;
			}
		}else if(array[center]<Bnow) {
			return search(center+1, right, array,Bnow,flag);
		}else {
			return search(left, center, array,Bnow,flag);
		}
	}
}