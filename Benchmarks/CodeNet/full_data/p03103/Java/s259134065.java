

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
class pair{
	int cost;
	int val;
	
	pair(int a,int b)
	{
		cost=a;
		val=b;
	}
}
class compare implements Comparator<pair>{

	@Override
	public int compare(pair o1, pair o2) {
		if(o1.cost>o2.cost)
		{
			return 1;
			
		}
		else if(o1.cost<o2.cost){
			return -1;
			
		}
		else {
			return 0;
		}
	}
	
}
public class Main {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		long m=scan.nextInt();
		pair[] x=new pair[n];
		for(int i=0;i<n;i++)
		{
			x[i]=new pair(scan.nextInt(),scan.nextInt());
		}
		Arrays.sort(x,new compare());
		long cur=0;
		long total=0;
		int index=0;
		while(cur<m)
		{
			total+=(x[index].cost*Math.min(m-cur,x[index].val));
			cur+=x[index].val;
			index++;
		}
		System.out.println(total);
	}
}
