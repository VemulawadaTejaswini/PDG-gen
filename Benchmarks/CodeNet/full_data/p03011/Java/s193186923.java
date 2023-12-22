import java.util.*;
import java.io.*;

public class Main
{
  	int p, q, r;
  
    Main(Scanner in, PrintWriter out)
    {
    	p = in.nextInt();
      	q = in.nextInt();
      	r = in.nextInt();
      	out.println(Math.min(p+q, Math.min(q+r, r+p)));
    }
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		new	Main(in, out);
		out.close();
	} 
}
