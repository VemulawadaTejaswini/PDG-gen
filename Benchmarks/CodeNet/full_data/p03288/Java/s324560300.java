import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int R = scanner.nextInt();
		
		if((0<= R)&&(R<1200)) {
			System.out.print("ABC");
		}else if((1200<= R)&&(R<2800)){
			System.out.print("ARC");
		}else {
			System.out.print("AGC");
		}
	}

}