import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		long[] X=new long[N];
		long[] A=new long[N-1];	//中央値計算に使用

		for(int i=0;i<N;i++) X[i]=sc.nextLong();	//入力を配列に格納

		for(int i=0;i<N;i++)
		{
			//N回ループする
			//Xの配列をAに再び格納
			if(i>=1) {
				for(int j=0;j<=i-1;j++) A[j]=X[j];
			}
			
			for(int k=i+1;k<=N-1;k++) A[k-1]=X[k];
			Arrays.sort(A);
			System.out.println(A[(N+1)/2-1]);
		} 
	}
} 