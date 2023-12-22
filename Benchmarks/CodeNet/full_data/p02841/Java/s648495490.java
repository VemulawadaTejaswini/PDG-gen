import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int M=stdIn.nextInt();
		int D=stdIn.nextInt();
		int A=stdIn.nextInt();
		int B=stdIn.nextInt();
		if(M!=A)
			System.out.println(1);
		else
			System.out.println(0);
	}
}
