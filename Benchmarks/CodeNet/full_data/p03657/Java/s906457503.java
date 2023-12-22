import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int A,B,X;
		A = s.nextInt();
		B = s.nextInt();
		X = A + B ;
		if(X % 3 == 0){
			System.out.println("Possible");
		}
		if(X % 3 != 0){
			System.out.println("Impossible");
		}
	}

}
