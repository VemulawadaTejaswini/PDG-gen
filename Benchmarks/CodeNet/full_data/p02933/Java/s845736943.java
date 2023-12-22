import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int a=stdIn.nextInt();
		String s=stdIn.next();
		if(a<3200)
			System.out.println("red");
		else
			System.out.println(s);
	}
}