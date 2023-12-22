//package atcoder;
import java.util.*;

 class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=Integer.parseInt(s.substring(0,2));
		int m=Integer.parseInt(s.substring(2));
		if(n>=1&&n<=12)
		{
			if(m>=1&&m<=12)
			{
				System.out.println("AMBIGUOUS");
			}
			else
			{
				System.out.println("MMYY");
			}
		}
		else
		{
			if(m>=1&&m<=12)
			{
				System.out.println("YYMM");
			}
			else
			{
				System.out.println("NA");
			}
		}

	}

}
