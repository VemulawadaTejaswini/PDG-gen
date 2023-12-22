import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int A=stdIn.nextInt();
		int P=stdIn.nextInt();
		P+=A*3;
		System.out.println(P/2);
	}
}