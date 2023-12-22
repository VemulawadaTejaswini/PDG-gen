import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int A=stdIn.nextInt();
		int B=stdIn.nextInt();
		if(A>B)
			System.out.print(B+" ");
		else
			System.out.print(A+" ");
		if((A+B)-N<0)
			System.out.print(0);
		else
			System.out.print((A+B)-N);
	}

}