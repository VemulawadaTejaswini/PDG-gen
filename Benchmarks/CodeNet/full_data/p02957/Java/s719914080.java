import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int A=stdIn.nextInt();
		int B=stdIn.nextInt();
		if((A+B)%2==0)
			System.out.println((A+B)/2);
		else
			System.out.println("IMPOSSIBLE");
	}
}
