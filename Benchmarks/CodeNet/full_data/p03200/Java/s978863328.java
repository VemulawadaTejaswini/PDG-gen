import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		//変数
		long count=0;
		boolean sw=false;
		String sb="";
		String sa="";
		int mcount=0;
		
		//入力
		Scanner sc = new Scanner(System.in);
		String S=sc.next();
		
		//処理
		sb=S;
		while(sw==false)
		{
			sa=sb.replace("BW","WB");
			if(sa.equals(sb))
			{
				sw=true;
			}else
			{
				for(int i=0;i<sb.length();i++)
				{
					if(sb.substring(i,i+1).equals(sa.substring(i,i+1)))
					{}else{
						mcount++;
					}
				}
				sb=sa;
				count=mcount/2;
			}
		}
		// 出力
		System.out.println(count);
	}
}