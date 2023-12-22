import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int R=scan.nextInt();
		if(R<1200)
		{
			System.out.println("ABC");
		}
		else if((1200<=R) && (R<2800))
		{
			System.out.println("ARC");
		}
		else if(R>2800)
		{
			System.out.println("AGC");
		}

	}

}
