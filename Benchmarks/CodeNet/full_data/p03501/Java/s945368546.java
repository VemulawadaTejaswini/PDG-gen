import java.util.Scanner;


public class Atcorder{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		int N =  scan.nextInt();
		int A = scan.nextInt();
		int B = scan.nextInt();

		int x = 0;
		int one = N * A;
		if(one >= B){
		x = B;
		}else{
			x = one;
		}

	System.out.println(x);

	}
}