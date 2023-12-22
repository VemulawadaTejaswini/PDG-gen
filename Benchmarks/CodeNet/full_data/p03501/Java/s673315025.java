import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int A = sc.nextInt()*T, B = sc.nextInt();
		if(A > B) System.out.println(B);
		else System.out.println(A);
	}

}
