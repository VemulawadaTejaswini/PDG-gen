import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A=in.nextInt();
		int B=in.nextInt();
		int C=in.nextInt();
		int D=in.nextInt();
		if(A*B>C+D)System.out.println(A*B);
		else if(A*B<C+D)System.out.println(C*D);
		else System.out.println(A*B);
		in.close();
		
	}

}