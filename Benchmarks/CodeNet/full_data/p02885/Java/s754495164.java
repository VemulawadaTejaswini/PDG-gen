import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int C = windowCover(sc.nextInt(), sc.nextInt());
		System.out.println(C);
		
		sc.close();

	}
	
	static int windowCover(int A, int B) {
		int C = A-2*B;
		if(C < 0) {
			C = 0;
		}
		return C;
	}

}