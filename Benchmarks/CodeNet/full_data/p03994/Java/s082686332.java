import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str=sc.next();
		int K=Integer.parseInt(sc.next());
		char[] cs=str.toCharArray();
		

		int num[]=new int [cs.length];
		int j=0;
		for(char c:cs)
		{
			num[j++]=c-97;
		}
		//base 26 start from0
		j=0;
		boolean notenough=false;
		o:while(K>0)
		{
			if(j==cs.length-1)
			{
				K--;
				num[j]=(1+num[j])%26;
			}
			else
			{
				if(K<26-num[j])
				{
					j++;
					continue o;
				}
				if(num[j]!=0)
				{
					K-=26-num[j];
					num[j]=0;
				}
				j++;
			}
		}
		StringBuilder sb=new StringBuilder();
		
		for(int chara:num)
			sb.append((char)(chara+97));
		
		System.out.println(sb.toString());
	}

}
