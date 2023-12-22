import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		float value = sc.nextFloat();
		
		
		float max = value/3;
		
		float result = max*max*max;
		System.out.println(result);
	}
}
