import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int x[]=new int[M];
		int sum=0;
		
		for(int i=0;i<N;i++) {
			int K=sc.nextInt();
		
			for(int j=1;j<=K;j++) {
				int A=sc.nextInt();
				x[A-1]++;
			}
		}
		for(int l=0;l<M;l++) {
			if(x[l]==N) {
				sum++;
			}
		}
		System.out.print(sum);
       
	}

}