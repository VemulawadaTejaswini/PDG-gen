import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N,K;
		N=scan.nextInt();
		K=scan.nextInt();
		int h[]=new int[N];
		int i,count=0;
		for(i=0;i<N;i++){
			h[i]=scan.nextInt();
		}
		for(i=0;i<N;i++){
			if(K<=h[i])count++;
		}
		System.out.print(count);
	}
}