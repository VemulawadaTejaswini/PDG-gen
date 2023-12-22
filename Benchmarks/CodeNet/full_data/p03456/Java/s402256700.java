import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner Sc = new Scanner(System.in);
		String s = Sc.nextLine();
		//String s1 = Sc.nextLine();
		s = s.concat(Sc.nextLine());
		int i=Integer.parseInt(s); 
		double root = Math.sqrt(i);
		if(root % 1 == 0){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}