import java.util.*;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> time = new ArrayList<Integer>();
		int mod_max_time = 0;
		int temp_index = 0;
		
		int sum_time = 0;

		for(int i = 0; i < 5; i++)
		{
			time.add(sc.nextInt());
			
			int temp = time.get(i) % 10;
			
			if(mod_max_time < temp)
			{
				mod_max_time = temp;
				temp_index = i;
			}
		}
		
		time.remove(temp_index);

		for(int j = 0; j < time.size(); j++)
		{
			int temp = time.get(j);
			if(temp % 10 > 0)
			{
				time.add(j, (temp / 10) * 10 + 10);
			}
			
			sum_time += time.get(j);
		}
		
		sum_time += mod_max_time;




	}

}
