import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String[] str = s.split("\\s+");
		int ball = Integer.parseInt(str[0]);
		int color = Integer.parseInt(str[1]);
		System.out.print((int)Math.pow(color - 1,ball - 1) * color);
	}
}