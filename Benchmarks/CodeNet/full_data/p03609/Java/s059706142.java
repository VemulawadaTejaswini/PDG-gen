import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		int t = scan.nextInt();

		int A = X-t;

		if(t < 0){
			System.out.println(t);
		}else{
			System.out.println(A);
		}

		scan.close();
	}
}
