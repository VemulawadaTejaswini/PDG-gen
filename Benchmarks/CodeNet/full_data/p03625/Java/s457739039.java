import java.util.*;
public class Main {
	
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		int nums = sc.nextInt();
		//ArrayList<Integer> save = new ArrayList<Integer>();
		int[] arr = new int[2];
		int count = 0;
		int[] sticks = new int[nums];
		for (int i= 0; i < nums; i++)
			sticks[i]=sc.nextInt();
		Arrays.sort(sticks);
			
		
		while (nums -- >=1)
		{
			if (sticks[nums]==sticks[nums-1])
			{
				//save.add(sticks[nums]);
				arr[count]= sticks[nums];
				nums--;
				count++;
			}
			if (count==2)
				break;
		}
		//if (count<2)
			//System.out.println(0);
		//else
			//System.out.println(save.get(0)*save.get(1));
			System.out.println(arr[0]*arr[1]);
		
	}
	
	
	
}
