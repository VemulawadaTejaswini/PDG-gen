import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int A = scn.nextInt(), B = scn.nextInt(),C = scn.nextInt(), D = scn.nextInt();
		boolean ans = C-A < D || A-C < D ||((A-B < D||B-A<D)&&(B-C<D||C-B<D));

		System.out.println(ans?"Yes":"No");
	}

}
