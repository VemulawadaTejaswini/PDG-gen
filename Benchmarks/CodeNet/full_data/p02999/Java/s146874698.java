import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
	
		Scanner scn=new Scanner(System.in);
		
		
		int x=scn.nextInt();
		int y=scn.nextInt();
		
		if(x==y) {
			System.out.println(10);
		}
		else if(x>y) {
			System.out.println(10);
		}
		else if(x<y) {
			System.out.println(0);
		}
				
		scn.close();
	}
}