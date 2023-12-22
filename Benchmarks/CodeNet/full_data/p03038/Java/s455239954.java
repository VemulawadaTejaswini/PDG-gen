import java.util.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inp1[]= br.readLine().split(" ");
		String inp[]= br.readLine().split(" ");
		int arr[]= new int[inp.length];
		for(int i=0; i<inp.length; i++)
		arr[i]= Integer.parseInt(inp[i]);
		Arrays.sort(arr);
        int n= Integer.parseInt(inp1[0]);
        int m= Integer.parseInt(inp1[1]);
        long count,max=0;
        while(m-->0)
        {
            count=0;
            String inp2[]= br.readLine().split(" ");
            int b= Integer.parseInt(inp2[0]);
            int c= Integer.parseInt(inp2[1]);
            for(int i=0; i<arr.length; i++)
            {
                if(i<b && arr[i]<c)
                count+=c;
                else
                count+=arr[i];
            }
            max=Math.max(count, max);
        }
        System.out.println(max);
	}
}