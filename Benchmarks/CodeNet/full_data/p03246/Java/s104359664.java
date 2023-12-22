import java.util.*;
import java.io.*;

public class Main
{
  	int n, sum = 0;
  	int max1 = 0, max2 = 0;
  	int who1 = 0, who2 = 0;
  	int[][] v;
  
    Main(Scanner in, PrintWriter out)
    {
      n = in.nextInt();
      v = new int[2][100_000];
      for (int i = 0; i < (n >> 1); i++)
      {
        int a = in.nextInt()-1;
        int b = in.nextInt()-1;
        v[0][a]++; v[1][b]++;
        if (v[0][a] > max1) { max1 = v[0][a]; who1 = a; }
        if (v[1][b] > max2) { max2 = v[1][b]; who2 = b; }
      }
      sum = max1+max2;
      if (who1 == who2) sum -= Math.min(max1, max2); 
      out.println(n-sum);
    }
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		new	Main(in, out);
		out.close();
	} 
}
