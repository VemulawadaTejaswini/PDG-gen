import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		long N=stdIn.nextLong();
		long A=stdIn.nextLong();
		long B=stdIn.nextLong();
		if((B-A)%2==0){
			System.out.println((B-A)/2);
		}
		else{
			long X=0;
			if(A-1<N-B){
				X+=A;
				B-=A;
				if(B<1)
					B=1;
				X+=(B-A)/2;
				System.out.println(X);
			}
			else{
				X+=N-B;X++;
				A+=(N-B)+1;
				if(A>N)
					A=N;
				X+=(B-A)/2;
				System.out.println(X);
			}
		}
	}
}
