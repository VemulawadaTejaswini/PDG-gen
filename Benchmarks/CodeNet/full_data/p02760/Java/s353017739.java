import java.io.*;
import java.util.*;
//import javafx.util.Pair;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main
{
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int A[][]=new int[3][3];		
		boolean flag=false;
		for(int i=0;i<3;i++)
		{
			String []s=br.readLine().split(" ");
			A[i][0]=Integer.parseInt(s[0]);
			A[i][1]=Integer.parseInt(s[1]);
			A[i][2]=Integer.parseInt(s[2]);
		}
		
		int N = Integer.parseInt(br.readLine());
		
		for(int k=0;k<N;k++)
		{
			int x=Integer.parseInt(br.readLine());
			
			//check in the matrix
			outer: 
			{
			
				for(int i=0;i<3;i++)
				{
					for(int j=0;j<3;j++)
					{
						if(A[i][j] == x)
						{
							A[i][j]=-1;
							break outer;
						}
					}
				}
			}
		}
		
		//check if bingo
		//row, col, diagonal
		for(int i=0;i<3;i++) //row
			if((A[i][0]==A[i][1]) && (A[i][1]==A[i][2])) //success
				flag=true;

		for(int i=0;i<3;i++) //column
			if((A[0][i]==A[1][i]) && (A[1][i]==A[2][i])) //success
				flag=true;
		
		if(((A[0][0]==A[1][1]) && (A[1][1]==A[2][2])) || ((A[0][2]==A[1][1]) && (A[1][1]==A[2][0]))) //diagonal
			flag=true;
			
		if(flag==true)
			out.println("Yes");
		else
			out.println("No");

	}
	
	
}


