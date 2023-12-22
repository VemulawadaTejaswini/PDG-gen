import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int K=stdIn.nextInt();
		int A[]=new int[N];
		int ans=0;
		for(int i=0;i<N;i++){
			A[i]=stdIn.nextInt();
		}
		ans++;N-=K;K--;
		if(N==0){
			System.out.println(1);
			System.exit(0);
		}
		if(ans%K==0){
			System.out.println(ans+(N/K));
		}
		else
			System.out.println(ans+(N/K)+1);
	}
}
