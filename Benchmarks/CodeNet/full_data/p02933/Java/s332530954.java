import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		String S=scan.next();
		
		if(a<=3200)
		{
			System.out.println(S);
		}
		else
		{
			System.out.println("red");
		}
	}

}