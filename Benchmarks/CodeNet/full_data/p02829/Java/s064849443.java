import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException
	{		
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
			
			String str1 = br.readLine();
			int num1 = Integer.parseInt(str1);
			
			String str2 = br.readLine();
			int num2 = Integer.parseInt(str2);

		if(num1==1 && num2==2)System.out.println("3");
		else if(num1==1 && num2==3)System.out.println("2");
		else if(num1==2 && num2==1)System.out.println("3");
		else if(num1==2 && num2==3)System.out.println("1");
		else if(num1==3 && num2==1)System.out.println("2");
		else if(num1==3 && num2==2)System.out.println("1");
	}
}


