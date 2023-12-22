import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		int max=200000007;
		int now_cost=0;
		int[] point=new int[N];

		for(int i=0; i<N; i++) {
			point[i]=sc.nextInt();
		}

		for(int i=0; i<N-K+1; i++) {
			now_cost=0;
			now_cost=Math.min(Math.abs(point[i])+point[K-1+i]-point[i],Math.abs(point[K-1+i])+point[K-1+i]-point[i]);
			max=Math.min(max,now_cost);
		}

		System.out.println(max);
	}
}