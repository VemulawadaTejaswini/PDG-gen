import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
    Scanner scan = new Scanner(System.in);
    int A = scan.nextInt();
    int B = scan.nextInt();
    int C = scan.nextInt();
    
    int rest;
    if(B+C < A) {rest =0;}
    else rest = B+C-A;

	
	
	System.out.println(rest);

		
	}

}
