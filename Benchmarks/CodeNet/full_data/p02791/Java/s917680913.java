import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int P[]=new int[N];
		int min=N*2,ans=0;
		for(int i=0;i<N;i++){
			P[i]=stdIn.nextInt();
			if(P[i]<=min){
				min=P[i];ans++;
			}
		}
		System.out.println(ans);
	}
}
