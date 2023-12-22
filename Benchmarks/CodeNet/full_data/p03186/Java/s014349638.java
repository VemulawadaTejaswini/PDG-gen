import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int A=stdIn.nextInt();
		int B=stdIn.nextInt();
		int C=stdIn.nextInt();
		if(A+B+1>=C)
			System.out.println(B+C);
		else
			System.out.println((A+B+1)+B);
	}
}