import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int i = scan.nextInt();
		int result = 0;
		if(i==1 && N==1)
			result = 1;
		else	
			result = (N-i)+1; 
		System.out.println(result);
	}
}