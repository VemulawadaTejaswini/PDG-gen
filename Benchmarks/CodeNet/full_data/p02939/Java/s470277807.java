import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		String s=ob.nextLine();
		int n=s.length();
		String arr[]=new String[2];
		arr[0]=""+s.charAt(0);
		int i,j;
		i=1;
int r=1;
		while(i<n)
		{
			String v="";
			j=i;
			while(j<n)
			{
				v=v+s.charAt(j);
			
				if(v.equals(arr[0]))
				{j++;
				}
				else 
					break;
			}
			i=j+1;
			arr[0]=v;
		
			r++;
		}
		System.out.println(r);
	}
}