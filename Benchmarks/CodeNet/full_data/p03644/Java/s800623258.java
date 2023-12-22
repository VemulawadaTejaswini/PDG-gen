import java.io.*;
import java.util.*;
public class Main {

	// BreakNumber
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(new File("BreakNum"));
		
		HashMap<Integer,Integer>map = new HashMap<>();
		ArrayList<Integer> values = new ArrayList<>();
		int num = in.nextInt();
		
		if(num >= 1 &&  num <= 100)
		{
			for(int i = 1; i <= num; i++)
			{
				map.put(i, countDiv(i));
				values.add(map.get(i));
			}
			
			Collections.sort(values);
			int maxNum = values.get(values.size()-1);
			
			for(int j = 1; j < map.size()-1; j++)
			{
				if(maxNum == (map.get(j)))
				{
					System.out.println(j);
				}
					
			}
			
		}
		
	}

	public static int countDiv(int n)
	{
		int counter = 0;
		while(n > 0)
		{
			if(n % 2 == 0)
			{
				counter++;
			}
			n = n/2;
		}
		return counter;
	}


}
