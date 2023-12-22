import java.util.Scanner;

public class Main{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int N=sc.nextInt();	//問題数

		int T[]=new int[N];	//それぞれの問題を解くのにかかる時間
		for(int i=0;i<N;i++) T[i]=sc.nextInt();

		int M=sc.nextInt();	//ドリンクの種類

		int sum=0;
		for(int i=0;i<N;i++) sum+=T[i];	//ドリンクを飲まないときの必要な時間

		int sum_drink[]=new int[N];	//ドリンクありの時に必要な時間

		for(int i=0;i<M;i++){
			int p=sc.nextInt();
			int x=sc.nextInt();
			sum_drink[i]=sum-T[p-1]+x;	//それぞれの場合の必要な時間を計算
		}

		for(int i=0;i<M;i++) System.out.println(sum_drink[i]);
		
	}
} 