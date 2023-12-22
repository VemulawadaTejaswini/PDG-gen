import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		
		if (S.equals("A"))
			System.out.println("T");
				
		else if (S.equals("T"))
			System.out.println("A");
		
		else if (S.equals("G"))
			System.out.println("C");
		
		else
			System.out.println("C");
	}

}
