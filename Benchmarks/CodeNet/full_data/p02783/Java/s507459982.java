import java.util.*;

 class p1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(Math.ceil((double)n/(double)k));
	}
}