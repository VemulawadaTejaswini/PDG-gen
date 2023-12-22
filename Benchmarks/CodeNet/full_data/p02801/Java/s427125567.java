import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		//科目数指定
		int N=scan.nextInt();
		//〇点中
		int K=scan.nextInt();
		//平均点
		int M=scan.nextInt();
		//配列に格納
		int[] A=new int[N-1];
		
		//N-1科目の合計
		int sum=0;
		for(int i=0; i<N-1; i++) {
		A[i]=scan.nextInt();
		sum=sum+A[i];
		}
		//
		int res=M*K-sum;
		//平均点まで何点足りないか
		if(res>K) {
			System.out.print(res);
		}else if(res==0){
			System.out.print(0);
		}else {
			System.out.print(-1);
		}
		}
	}

