import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();

		int[][] x = new int[10][10];
		int ans = 0;

		for(int i = 0 ; i < 10; i++)
		{
			for(int j = 0 ; j < 10; j++){
				x[i][j] = 0;
			}
		}

		for(int i = 0 ; i < n; i++)
		{
			for(int j = 0 ; j < d; j++){
				x[i][j] = sc.nextInt();
			}
		}

		int distsq = 0;
		for(int i = 0 ; i < n; i++)
		{
			for(int j = i+1 ; j < n; j++){
				distsq = 0;
				for(int k = 0 ; k < d ; k++){
					distsq += (x[i][k] - x[j][k])*(x[i][k] - x[j][k]);
				}
				if(((int)Math.sqrt(distsq))*((int)Math.sqrt(distsq)) == distsq)
				{
					ans++;
				}
			}
		}
		//ArrayList<Integer> iarr = new ArrayList<Integer>();


		System.out.println(ans);
	}

}