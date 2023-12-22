import java.util.Scanner;
public class Main
{
	public static void main(String []args)
	{	
       Scanner sc = new Scanner(System.in);
       String result=sc.nextLine();
       StringBuilder res=new StringBuilder (result);
       int x=sc.nextInt();
        sc.nextLine();
       char arr[][]=new char[x][3];
        for(int i=0;i<x;i++)
        {
        	String temp=sc.nextLine();
        	arr[i][0]=temp.charAt(0);
        	if(arr[i][0] == '2')
        	{
        		if(temp.charAt(2)=='2')
				{
					res.append(temp.charAt(4));
				}
        		else
        		{
        			res.insert(0,temp.charAt(4));
        		}
        		/*arr[i][1]=temp.charAt(2);
        		arr[i][2]=temp.charAt(4);
        		*/
        	}
        	else
        	{
        		if((i+1<x) && arr[i][0]==arr[i+1][0])
				{
					i++;
				}
				else
				{
				res.reverse();
				}
        	}
        }
        System.out.print(res);
        //stringForm(arr,res);
		
    }
}