
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int[] A=new int[N];
		for(int i=0; i<N; i++) {A[i]=0;}
		for(int i=0; i<N; i++) {A[i]=sc.nextInt();}
		int min=-1,max=0;
		for(int i=0; i<N; i++) {
			if(min==-1||A[i]<min)min=A[i];
			if(A[i]>max)max=A[i];
		}
		int b=0;
		int sum=0;
		int[] As=new int[N];
		for(int i=0; i<N; i++) {As[i]=0;}
		for(int i=0; i<N; i++) {sum+=Math.abs(A[i]-(b+i+1));As[i]=A[i]-(b+i+1);}
		int fb=0,assum=0;
		for(int i=0; i<N; i++) {assum+=As[i];}
		//As sort
		Arrays.sort(As);
		fb=As[(N-1)/2];
		sum=0;
		for(int i=0; i<N; i++) {sum+=Math.abs(A[i]-(fb+i+1));}

		System.out.println((sum));
	}
}
