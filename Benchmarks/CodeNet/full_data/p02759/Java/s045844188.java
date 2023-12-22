import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		if(N%2==1)
			System.out.println(N/2+1);
		else
			System.out.println(N/2);
	}
}
