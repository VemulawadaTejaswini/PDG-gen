
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		String s;
		int n,cnt=0;
		String[] str=new String[30000];
		for(int i=0;i<30000;i++)
			str[i]="zzzzzz";
		s=in.nextLine();
		n=in.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;i+j<s.length();j++)
			{
				str[cnt++]=s.substring(j,i+j+1);
			}
		}
		Arrays.sort(str);
		int k=0;
		for(int i=0;i<cnt;i++)
		{
			if(!str[i].equals(str[i+1]))
				k++;
			if(k==n)
				{System.out.println(str[i]);break;}
		}
	}

}
