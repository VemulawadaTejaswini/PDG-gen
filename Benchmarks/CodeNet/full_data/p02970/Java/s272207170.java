import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] argv)
	{
		try{
			BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
			String[] ctx=bf.readLine().split(" ");
			int N,D;
			N=Integer.parseInt(ctx[0]);
			D=Integer.parseInt(ctx[1]);
			Solver s =new Solver(N,D);
			s.res();
		}
		catch (IOException e)
		{
			System.exit(0);
		}
	}
}
class Solver
{
	int totalNum,dist;

	public Solver(int N,int D)
	{
		totalNum=N;
		dist=D;
	}
	public void res()
	{
		int gap=2*dist+1;
		if(totalNum%gap==0)
			System.out.printf("%d\n",totalNum/gap);
		else
			System.out.printf("%d\n",1+totalNum/gap);
	}
}
