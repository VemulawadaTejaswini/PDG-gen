import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		String str = scan.next();
		scan.close();
		
		int num_half = num / 2;
		
		if(num % 2 != 0) {
			System.out.println("NO");
		}
		
		if((num % 2 == 0) && str.substring(0,num_half).equals(str.substring(num_half,num)))
		System.out.println("YES");
	}
}
