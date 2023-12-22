import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt() ;int b = s.nextInt() ;int  c = s.nextInt() ;int 	x = s.nextInt();
		long count  =0 ;
		for(int i=0;i<=a;i++)
		{
			for(int j =0 ;j<=b;j++)
			{
				for(int k =0;k<=c;k++)
				{
					long sum = 500*i+100*j+50*k;
					if(sum == x)
					{
						// System.out.println(i+"  "+j+"   "+k +"  "+sum+"  "+x);
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}