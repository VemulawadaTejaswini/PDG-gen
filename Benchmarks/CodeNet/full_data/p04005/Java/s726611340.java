import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner (System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if(c%2 == 0){
			System.out.println("0");
		} else {
			System.out.println(a*b);
		}
	}
}