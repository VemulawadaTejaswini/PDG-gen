
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=Integer.parseInt(s.next());
		int[][] h=new int[size][3];
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<3;j++)
			{
				h[i][j]=s.nextInt();
			}
		}
		System.out.println(new Main().happiness(h));
		s.close();
	}
	
	public int happiness(int[][] activities)
	{
	
		for(int row=1;row<activities.length;row++)
		{
			for(int col=0;col<activities[0].length;col++)
			{
				activities[row][col]+=getMax(activities,row-1,col);
			}
		}
		return getMax(activities,activities.length-1,activities[0].length);
	}

	private int getMax(int[][] activities, int row, int c) {
		// TODO Auto-generated method stub
		int max=0;
		for(int col=0;col<activities[0].length;col++)
			if(col!=c)
				max=Math.max(max, activities[row][col]);
		return max;
	}

}
