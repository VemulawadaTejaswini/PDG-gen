import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		if(n < 105) {
			System.out.println(0);
		}else if(n < 165) {
			System.out.println(1);
		}else if(n < 195){
			System.out.println(2);
		}else {
			System.out.println(3);
		}
		in.close();

	}

}