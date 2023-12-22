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
		int a = file.nextInt();
		int b = file.nextInt();
		int ans = a+a-1;
		ans = Math.max(ans, b+b-1);
		ans = Math.max(ans, a + b);
		System.out.println(ans);
	}
}
