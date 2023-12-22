using System;
using System.Linq;

public class Test
{
	public static void Main()
	{
		// your code goes here
		
		var hoi = Console.ReadLine().Split().Select(nyan => int.Parse(nyan)).ToArray(); //この呪文覚えたい
		int n = hoi[0];
		int m = hoi[1];
		
		var a = Console.ReadLine().Split().Select(nyaan => int.Parse(nyaan)).ToArray(); //この呪文覚えたい
		
		int sum = 0;
		for(int i=0;i!=m;i++){
			
			sum += a[i];
			
		}
		
		int ans = n - sum;
		if(ans<0){
			
			ans = -1;
			
		}
		
		Console.WriteLine(ans);
		
	}
}