import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		
		String A = S.substring(0, 2);
		String B = S.substring(2, 4);
		
		int C = Integer.valueOf(A);
		int D = Integer.valueOf(B);
		
		if(C == 0 || (13 <= C && C <= 99))
		{
			if(D == 0 || (13 <= D && D <= 99))
			{
				System.out.println("NA");
			}else
			{
				System.out.println("YYMM");
			}
		}else
		{
			if(D == 0 || (13 <= D && D <= 99))
			{
				System.out.println("MMYY");
			}else
			{
				System.out.println("AMBIGUOUS");
			}
		}
	}
}