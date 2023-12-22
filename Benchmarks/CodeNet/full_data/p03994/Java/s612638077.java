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
		o:while(K>0)
		{
			if(j==cs.length-1)
			{
				K--;
				num[j]=(25+num[j])%26;
			}
			else
			{
				while(num[j]!=0)
				{
					if(K==0)
						break o;
					K--;
					num[j]--;
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
