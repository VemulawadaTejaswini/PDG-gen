

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String cur=scan.next();
		int k=scan.nextInt();
		TreeSet<String> set=new TreeSet<String>();
		for(int i=0;i<cur.length();i++)
		{
			for(int j=1;j<=5;j++)
			{
				if((i+j)>cur.length())break;
				set.add(cur.substring(i,i+j));
			}
		}
		int indx=1;
		for(String ad:set)
		{
			if(k==indx)
			{
				System.out.println(ad);
				break;
			}
			indx++;
		}
	}
}
