import java.util.Scanner;
public class Practice{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		int a = stdIn.nextInt();
		if(x <a)
			System.out.print(0);
		else
			System.out.print(10);
	}
}