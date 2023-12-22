import java.io.*;
public class Main {
	
	static String letters;
	public static void main (String[] args) throws Exception
	{
		//Scanner sc = new Scanner(System.in);
		//letters=sc.next();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		letters = br.readLine();
		
		System.out.println (finder(letters));
	}
	
	
	
	static String finder (String str)
	{
		int count ;
		for(int i = 0; i<26;i++)
		{
			count = 0;
			for (int j = 0; j <letters.length() ;j++)
			{
				if (letters.charAt(j)==('a'+i))
					count++;
			}	
			if (count==0)
				return((char)('a'+i) +"");
		}
		return ("None");
	}
}