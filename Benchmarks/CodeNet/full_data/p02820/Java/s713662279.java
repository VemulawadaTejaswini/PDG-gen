import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int K=stdIn.nextInt();
		int R=stdIn.nextInt();
		int S=stdIn.nextInt();
		int P=stdIn.nextInt();
		String T=stdIn.next();
		long ans=0;
		int A[]=new int[N];
		for(int i=0;i<N;i++){
			char a=T.charAt(i);
			int X=0;
			if(a=='r'){
				A[i]=P;
				ans+=A[i];
			}
			if(a=='s'){
				A[i]=R;
				ans+=A[i];
			}
			if(a=='p'){
				A[i]=S;
				ans+=A[i];
			}
			if(i>=K&&A[i]==A[i-K]){
				ans-=A[i];
				A[i]=-1;
			}
		}
		System.out.println(ans);
	}
}
