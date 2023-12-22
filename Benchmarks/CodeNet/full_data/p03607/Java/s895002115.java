import java.util.Scanner;


public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		String tmp="";
		for(int i=0;i<N;i++)
		{
			String a_i=sc.next();
			if(tmp.indexOf(a_i)==-1)
			{
				tmp=tmp+","+a_i;
			}
			else
			{
				tmp=tmp.replaceAll(a_i,"");
			}
		}
		sc.close();

		String[] tmp_a=tmp.split(",",0);
		int sum=0;
		
		for(int i=0;i<tmp_a.length;i++)
		{
			if(!tmp_a[i].equals(""))
			{
				sum++;
			}
		}
		
		System.out.println(sum);
	}

}
