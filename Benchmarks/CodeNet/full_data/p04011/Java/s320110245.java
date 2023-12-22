import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		int X=sc.nextInt();
		int Y=sc.nextInt();
		sc.close();
		int money=0;
		if(N>K) {
			for(int i=0;i<K;i++)
				money+=X;		
			for(int i=0;i<N-K;i++) 
				money+=Y;
		}else {
			for(int i=0;i<N;i++)
				money+=X;
		}
		System.out.println(money);
	}
}
