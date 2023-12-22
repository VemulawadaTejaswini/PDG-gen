import java.util.*;
import java.io.*;
import java.lang.Exception;

public class Main1{
	public static void main(String[] args)
			throws IOException
	{
		BufferedReader br = new BufferedReader(new
		InputStreamReader(System.in));
		int i=0;

		int a=Integer.parseInt(br.readLine());
		if(a%2==0)
			System.out.println(a/2);
		else
			i=1+a/2;
			System.out.println(i);


	}
}