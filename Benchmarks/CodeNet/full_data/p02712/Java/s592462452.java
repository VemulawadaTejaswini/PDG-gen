import java.util.*;
public class Main {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt(); long res=0;
		for(int i=1;i<=number;i++) {
			if(i%5!=0 && i %3!=0)
			{
				res+=i;
			}
		}
		System.out.println(res);
	}

}