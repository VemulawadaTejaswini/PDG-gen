import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] X=new int[N];
		int[] A=new int[N-1];	//中央値計算に使用

		for(int i=0;i<N;i++) X[i]=sc.nextInt();	//入力を配列に格納
		//for(int i=0;i<N;i++) System.out.println(X[i]);

		for(int i=0;i<N;i++)
		{
			//N回ループする
			//Xの配列をAに再び格納
			if(i>=1) {
				for(int j=0;j<=i-1;j++) A[j]=X[j];
			}
			
			for(int k=i+1;k<=N-1;k++) A[k-1]=X[k];

			//for(int k=0;k<=N-2;k++) System.out.print(A[k]);

			Arrays.sort(A);
			//for(int k=0;k<=N-2;k++) System.out.print(A[k]);
			//System.out.println();
			System.out.println(A[(N+1)/2-1]);
		} 
	}
} 