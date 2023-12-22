import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{

	public static int min(int[] a)
	{
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]<min && a [i]!=-1)
			{	min=a[i];
				a[i]=-1;
				System.out.println(a[i]);
			}	
		}
		return min;	
	}
	
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int x,y,z;
		
		String s = reader.readLine();
		String[] inp = s.split(" ");
		
		x=Integer.parseInt(inp[0]);
		y=Integer.parseInt(inp[1]);
		z=Integer.parseInt(inp[2]);
		
		int[] arr = new int[3];
		arr[0]=x;arr[1]=y;arr[2]=z;
		
		int cost=0;
		
		int a  = Math.min(x,Math.min(y,z));
				
		if(a==x)
		{
			int b = Math.max(y,z);
			cost=cost+Math.abs(b-a);
			
			cost=cost+(Math.max(y,z)-b);
			
		}
		else if(a==y)
		{
			int b = Math.max(x,z);
			cost=cost+Math.abs(b-a);
			
			cost=cost+(Math.max(x,z)-b);
			
		}
		else if(a==z)
		{
			int b = Math.max(x,y);
			cost=cost+Math.abs(b-a);
			
			cost=cost+(Math.max(x,y)-b);
		}

		System.out.println(cost);
	}

}
