import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int A=stdIn.nextInt();
		int B=stdIn.nextInt();
		int C=stdIn.nextInt();
		int X=stdIn.nextInt();
		int Y=stdIn.nextInt();
		int z=0,ans=0;
		if(Y>X){
			z=X;X=Y;Y=z;
			z=A;A=B;B=z;
		}
		if(A+B>C*2){
			ans+=Y*C*2;
			X-=Y;
			if(A>C*2)
				ans+=X*C*2;
			else
				ans+=X*A;
		}
		else{
			ans+=(Y*B)+(Y*A);
			X-=Y;
			if(A>C*2)
				ans+=X*C*2;
			else
				ans+=X*A;
		}
		System.out.println(ans);
	}
}