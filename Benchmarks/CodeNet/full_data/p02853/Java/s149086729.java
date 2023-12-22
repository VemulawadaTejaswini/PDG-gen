import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int X=stdIn.nextInt();
		int Y=stdIn.nextInt();
		int ans=0;
		if(X<4)
			ans+=300000/X;
		if(X==2)
			ans+=50000;
		if(Y<4)
			ans+=300000/Y;
		if(Y==2)
			ans+=50000;
		if(X==1&&Y==1)
			ans+=400000;
		System.out.println(ans);
	}
}
