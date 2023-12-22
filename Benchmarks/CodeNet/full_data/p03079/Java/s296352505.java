import java.util.Scanner;

public class Main {
	public static void main(String[] arr)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a+b>c&&Math.abs(a-b)<c&&a==b||b==c)
		System.out.println("Yes");
		else 
			System.out.println("No");


	}
}
