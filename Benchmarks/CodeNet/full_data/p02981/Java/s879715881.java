import java.util.*;

public class Main{
	public static void main(String ...ar){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a*n<b)
			System.out.println((a*n));
		else 
			System.out.println(b);
	}
}