import java.util.*;
public class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int A[]=new int[N];
		int B[]=new int[M];
		int C[]=new int[M];
		int D[][]=new int[M][];//number in A sorted from minimum
		int min;
		int probe;
		int count;
		long result=0;
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}
		for(int j=0;j<M;j++) {
			B[j]=sc.nextInt();
			C[j]=sc.nextInt();
			D[j]=new int[B[j]];//make boxes to record the number A[i] is smallest to B[j]th smallest
		}
		sc.close();
		for(int k=0;k<M;k++) {
			min=0;
			for(int l=0;l<B[k];l++) {
				probe=count=0;
				for(int m=0;m<N;m++) {//find first probe
					if(A[m]>min) {
						probe=A[m];
						break;
					}
				}
				for(int n=0;n<N;n++) {//find lth smallest number
					if(min<A[n]&&A[n]<probe) {
						probe=A[n];
					}
				}
				for(int o=0;o<N;o++) {
					if(A[o]==probe) {
						D[k][l+count]=o;
						count++;
					}
					if(l+count>=B[k]) {
						break;
					}
				}
				l+=count-1;//if some number makes A[i]=probe, add l
				min=probe;//eliminate numbers at least smaller than probe in next turn
			}
			for(int p=0;p<B[k];p++) {
				if(A[D[k][p]]<C[k]) {//select A[i] to make A[i] bigger by substitution
					A[D[k][p]]=C[k];
				}
			}
		}
		for(int q=0;q<N;q++) {
			result+=A[q];
		}
		System.out.println(result);
	}
}