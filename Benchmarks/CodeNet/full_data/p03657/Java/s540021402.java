import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int A,B;
		A = s.nextInt();
		B = s.nextInt();
		if(A % 3 != 0){
			System.out.println("Impossible");
		}else
		if(B % 3 != 0){
			System.out.println("Impossible");
		}else
		if((A + B) % 3 != 0){
			System.out.println("Impossible");
		}else
		if((A + B) % 3 == 0){
			System.out.println("Possible");

		}
	}

}
