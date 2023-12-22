import java.awt.Polygon;
import java.awt.geom.Area;
import java.awt.geom.PathIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Exception
	{
		new Main().run();
	}
	
	public void run() throws Exception
	{
		Scanner file = new Scanner(System.in);
		char[] chars = file.next().toCharArray();
		int len = chars.length;
		int c1 = 0;
		int c2 = 0;
		for(int i = 0;i<len;i++)
		{
			if(i%2==0 ^ chars[i] == '0')
				c1++;
			else
				c2++;
		}
		System.out.println(Math.min(c1, c2));
	}
}
