import java.util.*;

public class Main{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();	//Nマス
		int A=sc.nextInt();	//Aliceの位置
		int B=sc.nextInt();	//Borysの位置
		String ans;

		if((A-B-1)%2==0) ans="Borys";
		else ans="Alice";

		System.out.println(ans);

	}
}