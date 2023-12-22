import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		if (N<105)
			System.out.println(0);
		
		else if (N<135)
			System.out.println(1);
		
		else if (N<165)
			System.out.println(2);
		
		else if (N<189)
			System.out.println(3);
		
		else if (N<195)
			System.out.println(4);
		
		else 
			System.out.println(5);
		
		sc.close();
	}

}
