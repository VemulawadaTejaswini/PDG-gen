
import java.util.*;

public class Main {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int w=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		if((a+w<b)||b+w<a){
		int ans1=Math.abs(a+w-b);
		int ans2=Math.abs(b+w-a);
		System.out.println(Math.min(ans1, ans2));
		}
		else System.out.println("0");
	}
}
