import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		if(k%2==0) {
			System.out.println(k*k/4);
		}else {
			System.out.println((k-1)*(k+1)/4);
		}
		

	}

}
