import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		int D=sc.nextInt();
		int one_size=A*B;
		int two_size=C*D;
		if(one_size>=two_size) {
			System.out.println(one_size);
		}else {
			System.out.println(two_size);
		}
	}

}
