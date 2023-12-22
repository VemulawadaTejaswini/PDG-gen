import java.util.*;
import java.io.*;

public class Main
{
  	int a, b, t;
  
    Main(Scanner in, PrintWriter out)
    {
    	a = in.nextInt();
      	b = in.nextInt();
     	t = in.nextInt();
      	out.println(b*(t/a));
    }
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		new	Main(in, out);
		out.close();
	} 
}