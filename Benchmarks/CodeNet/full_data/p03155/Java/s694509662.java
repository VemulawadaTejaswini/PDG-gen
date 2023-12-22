import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner( System.in);
		int N ,H,W;
            N=stdin.nextInt() ;
            H=stdin.nextInt() ;
            W=stdin.nextInt() ;
            
           
        System.out.println((N-H+1)*(N-W+1));
	}
}
