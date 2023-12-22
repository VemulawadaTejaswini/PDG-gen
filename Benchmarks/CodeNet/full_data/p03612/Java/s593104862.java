import java.util.*;

class Main 
{
	static int f(int arr[], int flag[])
	{
		int cnt = 0;
		for(int i = 0, j = 0; i < arr.length; i++)
		{
			if(flag[i] == 1)
			{
				for(j = i + 1; j < arr.length; j++)
					if(flag[j] == 1)
						break;
				
				if(j - i == 1)
				{	
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					cnt++;
				}
				else
				{
					if(arr[i - 1] != i)
					{
						int temp = arr[i];
						arr[i] = arr[i - 1];
						arr[i - 1] = temp;
					}
					else
					{
						int temp = arr[i];
						arr[i] = arr[i + 1];
						arr[i + 1] = temp;
					}

					if(arr[j - 1] != j)
					{
						int temp = arr[j];
						arr[j] = arr[j - 1];
						arr[j - 1] = temp;
					}
					else
					{
						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
					}
					
					cnt += 2;
				}
				i = j + 1;
			}
		}

		return cnt;
	}

  	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] =  new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		int max_cnt = 0, cnt = 0;
		
		while(true)
		{
			int flag[] = new int[n];
			for(int i = 0; i < n; i++)
				if(arr[i] == i + 1)
					flag[i] = 1;

			cnt = f(arr, flag);

			if(cnt == 0)
				break;
			max_cnt += cnt;
		}

		System.out.println(max_cnt);
  	}
}