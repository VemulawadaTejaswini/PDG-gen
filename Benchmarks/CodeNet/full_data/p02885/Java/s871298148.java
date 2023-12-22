import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(System.in);

        int A = stdin.nextInt();
        int B = stdin.nextInt();
        
        if(A-(B*2)>=0) {
        	System.out.println(A-(B*2));
        }
        else {
        	System.out.println("0");
        }
	}
}
