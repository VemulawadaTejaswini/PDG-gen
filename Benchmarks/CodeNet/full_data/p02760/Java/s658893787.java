/* Click on the checkbox for Add Custom Input and then write the input there before running the program */
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int[][] a = new int[3][3];
	    for(int i=0;i<3;i++)
	        for(int j=0;j<3;j++)
	            a[i][j] = input.nextInt();
	    
	    int q = input.nextInt();
	    while(q-->0)
	    {
	        int n = input.nextInt();
	        
	        for(int i=0;i<3;i++)
	            for(int j=0;j<3;j++)
	                if(a[i][j]==n)
	                    a[i][j]=-1;
	    }
	    if(isRow(a)||isCol(a)||isDiag(a))
	        System.out.println("Yes");
	    else
	        System.out.println("No");
	}
	static boolean isRow(int[][] a)
	{
	    boolean flag = false;
	    for(int i=0;i<3;i++)
	    {
	        for(int j=0;j<3;j++)
	        {
	            if(a[i][j]==-1)
	                flag = true;
	            else
	            {
	                flag = false;
	                break;
	            }
	        }
	        if(flag)
	            break;
	    }
	    return flag;
	}
	
	static boolean isCol(int[][] a)
	{
	    boolean flag = false;
	    for(int i=0;i<3;i++)
	    {
	        for(int j=0;j<3;j++)
	        {
	            if(a[j][i]==-1)
	                flag = true;
	            else
	            {
	                flag = false;
	                break;
	            }
	        }
	        if(flag)
	            break;
	    }
	    return flag;
	}
	static boolean isDiag(int[][] a)
	{
	    boolean flag1=false,flag2 = false;
	    for(int i=0;i<3;i++)
	    {
	        if(a[i][i]==-1)
	            flag1 = true;
	        else{
	            flag1 = false;
	            break;
	        }
	    }
	    if(a[0][2]==a[1][1]&&a[1][1]==a[2][0])
	        flag2=true;
	    else
	        flag2=false;
	    return flag1||flag2;
	}
}