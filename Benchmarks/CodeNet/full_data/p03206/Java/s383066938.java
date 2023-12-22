import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		System.out.print("Christmas ");
		for(int i=0;i<25-num;i++)
		{
			System.out.print("Eve ");
		}
		System.out.println();
	}
}