
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>();
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			list.add(sc.nextInt());
		}
		for(int i=1;i<=n;i++)
			System.out.print(list.indexOf(i)+1+" ");
	}

}
