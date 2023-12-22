import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		short A = 0, B = 0, C = sc.nextShort();
		
		if( A <= C && C <= B ){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
		sc.close();
		
	}

}
