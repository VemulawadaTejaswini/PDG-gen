	import java.util.*;
	
public class Main
{ 
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int i=0;
		String s;
		while(scan.hasNext())
		{
			s = scan.nextLine();
			System.out.print(s.charAt(i++));
		}
		scan.close();		
	}
}
