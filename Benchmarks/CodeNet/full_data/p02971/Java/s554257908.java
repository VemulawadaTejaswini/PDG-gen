import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N =scan.nextInt();
		List<Integer> intList=new ArrayList<Integer>();
		int maxResult=0;

		for(int i=0; i<N ;i++)
		{
			intList.add(scan.nextInt());
		}
		Integer[] intArray = intList.toArray(new Integer[intList.size()]);

		for(int j=0; j<N ;j++)
		{
			System.out.println(maxReturn(j,intArray));
		}


		System.out.println();

	}

	public static int maxReturn(int me , Integer[] intArray)
	{
		int Max=0;
		for(int i=0; i< intArray.length;i++)
		{
			if(i == me)
			{
				continue;
			}
				else if(Max < intArray[i])
			{
				Max=intArray[i];
			}
		}
		return Max;
	}
}
