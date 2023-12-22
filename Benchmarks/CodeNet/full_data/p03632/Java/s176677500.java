import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		if((B-C)>0 && C>A) {
			System.err.println(B-C-A);
		}else{
			System.out.println("0");
		}
	}

}