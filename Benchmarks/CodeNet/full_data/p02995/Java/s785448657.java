import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		long A, B, C, D;
		A = Long.parseLong(sc.next());
		B = Long.parseLong(sc.next());
		C = Long.parseLong(sc.next());
		D = Long.parseLong(sc.next());
		
		int count = 0;
		
		long tmpAC = A / C;
		long tmpBC = B / C;
		
		long tmpAD = A / D;
		long tmpBD = B / D;
		
		long tmpACD = A / (C*D);
		long tmpBCD = B / (C*D);
		
		long ans = tmpBC - tmpAC + tmpBD - tmpAD - (tmpBCD - tmpACD);
		
		ans = B - A + 1 - ans;
		
		
		System.out.println(ans);

	}

}
