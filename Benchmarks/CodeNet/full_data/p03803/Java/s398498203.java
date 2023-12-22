import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		
		int a = input1.nextInt();
		int b = input2.nextInt();
		if(a == 1) a += 13;
		if(b == 1) b += 13;
		if(a > b) System.out.println("Allice");
		else if(b > a) System.out.println("Bob");
		else System.out.println("Draw");
		input1.close();
		input2.close();
				
		
	}

}
