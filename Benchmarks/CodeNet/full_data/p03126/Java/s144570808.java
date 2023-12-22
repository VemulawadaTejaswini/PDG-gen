import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		// Input Example:
		//
		// N M
		// K1 A11 A12 ... A1k1
		// K2 A21 A22 ... A2k2
		// .
		// .
		// .
		// KN AN1 AN2 ... ANkN

		Scanner sc = new Scanner(System.in);
		// N people
		int N = sc.nextInt();
		
		// get two integers separated with half-width break
		// M kinds of foods
		int M = sc.nextInt(); 

		// Ki: the number of foods that No.i+1 person like
		int K;

		// map[M]: the table of the likeness of each foods 
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i=0; i<N; i++)
		{
			K = sc.nextInt();
			for (int j=0; j<K; j++)
			{
				int K_temp = sc.nextInt();
				if (map.containsKey(K_temp))
				{
					int val = map.get(K_temp); // food no. K_temp +1
					val++;
					map.put(K_temp, val);
				}
				else
				{
					map.put(K_temp, 1);
				}
			}
		}
		sc.close();

		int ans = 0;
		// for (int i=1;i<map.size();i++)
		// {
		// 	if (map.get(i) == N) //it means everyone (N people) likes it
		// 	{
		// 		ans++;
		// 	}
		// }
		for (int val : map.values())
		{
			if (val == N)
			{
				ans++;
			}
		}
		System.out.println(ans);
		
	}

}