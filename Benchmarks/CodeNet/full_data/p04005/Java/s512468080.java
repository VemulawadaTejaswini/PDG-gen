import java.util.Scanner;

public class Main {
	
	static final Scanner in = new Scanner(System.in);
	
	private static int[] input(){
		int a[] = new int[3];
		for(int i=0; i<a.length; i++)
		{
			a[i] = in.nextInt();
		}
		return a;
	}	
	private static int solve(int a[])
	{
		if (a[0]%2 == 0 || a[1]%2==0)
		{
			return 0;
		} else {
			return Math.min(a[0]*a[1], a[1]*a[2]);
		}
	}
 
	public static void main(String[] args) {
		System.out.println(solve(input()));
	}

}