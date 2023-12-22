import java.util.Arrays;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int n=input.nextInt();
		int[] arr=new int[n];
		int[] temp=new int[arr.length];
		int tem,c=0;;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=input.nextInt();
			temp[i]=arr[i];
		}
		input.close();
		Arrays.sort(temp);	
          
		for(int j=0;j<arr.length;j++)
		{
			if(temp[j]!=arr[j]) 
			{
				c++;
			}
		
	   }

		if(c>2) 
		{
			System.out.println("NO");
		}
		else
		{
			System.out.println("Yes");
		}	
		System.exit(0);
		
	}
}
