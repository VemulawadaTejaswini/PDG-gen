import java.io.*;
import java.util.*;

public class Main
{

	
	
	
	public static void main(String[] Rohan)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();


		Stack<Integer> st = new Stack<Integer>();


		int num=0;

		for(int i=0;i<s.length();i++)
		{
			if(st.size()==0)
				st.push(s.charAt(i)-'0');
			else
			{
				if(st.peek()!=(s.charAt(i)-'0'))
				{
					st.pop();num+=2;
				}
				else
					st.push(s.charAt(i)-'0');;
			}
		}
		System.out.println(num);
			
		

	}
}