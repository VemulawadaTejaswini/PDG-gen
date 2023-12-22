import java.util.*;
class Main
{
	static int totrow ,totcol , currow ,curcol;
	static int[][] arr , visit	;
	static long sum =0;

	public static void pathfinder(int row , int col)
	{
		// System.out.println(row+"  "+col);
		if(row!=totrow-1 || col!=totcol-1)
		{
			if(row+1 < totrow && arr[row+1][col]==1 && visit[row+1][col]==0)// down
			{
				visit[row+1][col]=1;
				sum++;
				currow = row+1;curcol = col;
				pathfinder(row+1,col);
				// sum--;
			}
			else if(col+1 < totcol && arr[row][col+1]==1 && visit[row][col+1]==0)//right
			{
				visit[row][col+1]=1;
				sum++;
				currow = row;curcol = col+1;
				pathfinder(row,col+1);
				// sum--;
			}
			else if( row-1 >=0 && arr[row-1][col]==1 && visit[row-1][col]==0)//left
			{
				visit[row-1][col]=1;
				sum++;
				currow = row-1;curcol = col;
				pathfinder(row-1,col);
				// sum--;
			}
			else
			{
				// sum--;
				return;
			}
		}

	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		totrow =s.nextInt();
		totcol = s.nextInt();
		arr = new int[totrow][totcol];
		visit = new int[totrow][totcol];
		int countstr =0 ;
		for(int i =0;i<totrow;i++)
		{
			String line = s.next();
			for(int j=0;j<line.length();j++)
			{
				if(line.charAt(j)=='.')
				{
					countstr++;
					arr[i][j]=1;
				}
			}
		}

		pathfinder(0 , 0);
		// System.out.println(totrow+"  "+totcol);
		// System.out.println(currow+"  "+curcol+"   "+sum+"  "+countstr);

		if((currow== totrow-1) && ( curcol==totcol-1))
			System.out.println(countstr-sum-1);
		else
			System.out.println("-1");
	}
}