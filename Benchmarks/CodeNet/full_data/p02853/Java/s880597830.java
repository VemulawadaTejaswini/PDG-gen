import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int X=stdIn.nextInt();
		int Y=stdIn.nextInt();
		int ans=0;
		if(X<4)
			ans+=300000/X;
		if(Y<4)
			ans+=300000/Y;
		if(X==1&&Y==1)
			ans+=400000;
		System.out.println(ans);
	}
}
