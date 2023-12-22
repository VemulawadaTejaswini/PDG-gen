import java.util.Scanner;
public class main {
	public static void main(String[]args){
		Scanner tc =new Scanner(System.in);
		int N,K;
		N=tc.nextInt();
		K=tc.nextInt();
		if(N>K){
			int D=N-K;
			System.out.println(D);
		}if(K>N){
			int D=K-N;
			System.out.println(D);
		}
		
	}

}
