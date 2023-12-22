import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int[][] arr = new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j =0 ;j<3;j++)
			{
				arr[i][j] = s.nextInt();
			}
		}

		int flag =0 ;
		for(int i =0 ;i<2;i++)
		{
			if((arr[i][0] - arr[i][1]) != (arr[i+1][0] - arr[i+1][1]))
				flag = 1;
			if((arr[i][1] - arr[i][2]) != (arr[i+1][1] - arr[i+1][2]))
				flag = 1;
		}

		for(int i =0 ;i<2;i++)
		{
			if((arr[0][i] - arr[1][i]) != (arr[0][i+1] - arr[1][i+1]))
				flag = 1;
			if((arr[1][i] - arr[2][i]) != (arr[1][i+1] - arr[2][i+1]))
				flag = 1;
		}
		if(flag != 0)
			System.out.println("No");
		else
			System.out.println("Yes");
	}
}
