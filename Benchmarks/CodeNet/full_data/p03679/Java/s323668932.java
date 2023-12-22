import java.util.Scanner;

// Java8
public class Main
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception
	{ 
		new Main().run();
	}
	
	void run()
	{
		int x = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>=b) System.out.println("delicious");
		else if(x+a>=b) System.out.println("safe");
		else System.out.println("dangerous");
	}
	
}
