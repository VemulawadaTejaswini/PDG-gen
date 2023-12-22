import java.util.Scanner;
public class Main
{
	public static void main(String []args)
	{	
       Scanner sc = new Scanner(System.in);
       String res=sc.nextLine();
       int x=sc.nextInt();
        sc.nextLine();
       char arr[][]=new char[x][3];
        for(int i=0;i<x;i++)
        {
        	String temp=sc.nextLine();
        	arr[i][0]=temp.charAt(0);
        	if(arr[i][0] == '2')
        	{
        		arr[i][1]=temp.charAt(2);
        		arr[i][2]=temp.charAt(4);
        	}
        	
        } 
        stringForm(arr,res);
        
        
    }
	
 public static void stringForm(char arr[][],String result)
	{
		StringBuilder middle=new StringBuilder (result);
		StringBuilder prefix=new StringBuilder ();
		StringBuilder suffix=new StringBuilder ();
		StringBuilder res=new StringBuilder ();
		int ones=0;
		int TotalOnes=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i][0]=='2')
			{
				if(ones % 2 != 0)
				{
					suffix.reverse();
					prefix.reverse();
					StringBuilder temp=new StringBuilder ();
					temp=suffix;
					suffix=prefix;
					prefix=temp;	
				}
				if(arr[i][1]=='2')
				{
					suffix.append(arr[i][2]);
					//res.append(arr[i][2]);
				}
				else
				{
					prefix.insert(0,arr[i][2]);
					//res.insert(0,arr[i][2]);
				}
				ones=0;
				
			}
			else
			{
				ones++;
				TotalOnes++;
			}
		}
		
		if(ones % 2 !=0)
		{
			suffix.reverse();
			prefix.reverse();
			StringBuilder temp=new StringBuilder ();
			temp=suffix;
			suffix=prefix;
			prefix=temp;
		}
		if(TotalOnes %2 !=0)
		{
			res=res.append(prefix);
			res=res.append(middle.reverse());
			res=res.append(suffix);
		}
		else
		{
			res=res.append(prefix);
			res=res.append(middle);
			res=res.append(suffix);
		}
		
		System.out.println(res);
	}
	
}
