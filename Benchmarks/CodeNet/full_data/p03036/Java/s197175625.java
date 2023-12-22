import java.util.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inp[]= br.readLine().split(" ");
        int r= Integer.parseInt(inp[0]);
        int d= Integer.parseInt(inp[1]);
         long x= Long.parseLong(inp[2]);
        int i=10;
        while(i-->0)
        {
        	x=r*x-d;
        	System.out.println(x);
        }
	}
}