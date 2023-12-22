import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int H=stdIn.nextInt();
		int W=stdIn.nextInt();
		int D=stdIn.nextInt();
		int L=0,R=0,X=0,Y=0,c=0;
		String A[]=new String[H*W+1];
		int z=0,y=0,ans=0;
		while(z<H*W){
			while(y<W){
				L=stdIn.nextInt();
				A[L]=z/H+","+y;
				z++;y++;
			}y=0;
		}z=0;y=0;L=0;
		int Q=stdIn.nextInt();
		while(z<Q){
			L=stdIn.nextInt();
			R=stdIn.nextInt();
			while(L<R){
				c=A[L].indexOf(',');
				X=Integer.valueOf(A[L].substring(0,c));
				Y=Integer.valueOf(A[L].substring(c+1,A[L].length()));
				c=A[L+D].indexOf(',');
				X-=Integer.valueOf(A[L+D].substring(0,c));
				Y-=Integer.valueOf(A[L+D].substring(c+1,A[L].length()));
				if(X<0)
					X*=-1;
				if(Y<0)
					Y*=-1;
				ans+=X+Y;
				L+=D;
			}
			System.out.println(ans);
			ans=0;
			z++;
		}
	}
}