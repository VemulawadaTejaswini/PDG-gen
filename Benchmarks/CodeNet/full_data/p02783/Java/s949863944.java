import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float H =input.nextFloat();
		float A =input.nextFloat();	
		float n =  H/A +1 ;
		System.out.print((int)n)	;	
	}
}
