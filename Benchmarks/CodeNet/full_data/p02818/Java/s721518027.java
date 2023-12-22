import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		long A=stdIn.nextLong();
		long B=stdIn.nextLong();
		long K=stdIn.nextLong();
		if(A<K){
			K-=A;A=0;
		}
		else{
			A-=K;K=0;
		}
		B-=K;
		if(B<0)
			B=0;
		System.out.println(A);
		System.out.println(B);
	}
}
