import java.util.*;

class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for(int i = 0; i < n; i++)
			if(map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i]) + 1);
			else
				map.put(arr[i], 1);

		Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
		for(Object m : map.keySet())
			if(map.get(m) >= 2)
				map2.put(Integer.valueOf(m.toString()), map.get(m));

		int max1 = 0;
		int max2 = 0;

		for(Object m : map2.keySet())
			if(Integer.valueOf(m.toString()) >= max1)
			{
				max2 = max1;
				max1 = Integer.valueOf(m.toString());
			}

		System.out.println(max1 * max2);
	}
}