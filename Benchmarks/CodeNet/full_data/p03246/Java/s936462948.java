

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
class  goodx{
	int freq;
	int val;
	goodx(int a,int b)
	{
		freq=a;
		val=b;
	}
}
class comparator implements Comparator<goodx>{

	@Override
	public int compare(goodx o1, goodx o2) {
		if(o1.freq<o2.freq)
		{
			return 1;
		}
		else if(o1.freq>o2.freq)
		{
			return -1;
		}else {
			return 0;
		}
	}
	
}
public class Main {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=scan.nextInt();
			
		}
		int first[]=new int[1000007];
		int second[]=new int[1000007];
		goodx lol[]=new goodx[n/2];
		
		int counter=0;
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				first[ar[i]]++;
			}else {
				second[ar[i]]++;
				
			}
		}
		for(int i=1;i<n;i+=2) {
			lol[counter++]=new goodx(second[ar[i]],ar[i]);
		}
		Arrays.parallelSort(lol,new comparator());
//		for(int i=0;i<lol.length;i++)
//		{
//			System.out.println(lol[i].val+" "+lol[i].freq);
//		}
		int global=Integer.MAX_VALUE;
		for(int i=0;i<n/2;i+=2)
		{
			int cost1=(n/2)-first[ar[i]];
			int cost=0;
			for(int j=0;j<n/2;j++)
			{
				if(lol[j].val==ar[i])
					{continue;
					}
				cost=lol[j].freq;
				break;
			}
//			System.out.println(cost);
			int cost2=(n/2)-cost;
//			System.out.println(cost1+" "+cost2);
			global=Math.min(global,cost1+ cost2);
//			System.out.println(global+"this is golal ");
		}
		System.out.println(global);
		
		
	}
}
