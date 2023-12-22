import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = Integer.parseInt(in.nextLine());
		int B = Integer.parseInt(in.nextLine());
		int C = Integer.parseInt(in.nextLine());
		int D = Integer.parseInt(in.nextLine());
		in.close();
		int result = Math.min(A, B) + Math.min(C, D);
		System.out.println(result);

	}

}