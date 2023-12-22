import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		long A=stdIn.nextLong();
		long B=stdIn.nextLong();
		long ans=A;
		while(A<B){
			ans=ans^A+1;
			A++;
		}
		System.out.println(ans);
	}

}