import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		int A = scan.nextInt();
		int B = scan.nextInt();

		int taste = A - B;
		int safe = X + taste;

		if(taste>= 0 && safe >=0){
			System.out.println("delicious");
		}else if(taste<0 && safe>=0){
			System.out.println("safe");
		}else{
			System.out.println("dangerouns");
		}

	}

}
