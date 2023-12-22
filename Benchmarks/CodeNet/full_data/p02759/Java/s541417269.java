 
import java.util.*;
import java.lang.*;
import java.io.*;
 
class Solution
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(n%2==0){
			System.out.println(n/2);
		}
		else{
			System.out.println((n/2)+1);
		}
	}
}