import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int K=stdIn.nextInt();
		long H[]=new long[N];
		long ans=0;
		for(int i=0;i<N;i++){
			H[i]=stdIn.nextInt();
		}
		Arrays.sort(H);
		for(int i=0;i<N-K;i++){
			ans+=H[i];
		}
		System.out.println(ans);
	}
}
