import java.util.*;
public class Main
{
    static StringBuilder dp[][];
    public static String lcs(String s,String t,int index1,int index2)
    {
        if(index1>=s.length()){return "";}
        if(index2>=t.length()){return "";}
        if(dp[index1][index2]!=null)return dp[index1][index2].toString();
        StringBuilder temp1=new StringBuilder(),temp2=new StringBuilder();
        if(s.charAt(index1)==t.charAt(index2)) temp1.append(s.charAt(index1)).append(lcs(s,t,index1+1,index2+1));
        else
        {
          temp1.append(lcs(s,t,index1,index2+1));
          temp2.append(lcs(s,t,index1+1,index2));
        }
        if(temp1.length()>temp2.length()){dp[index1][index2]=temp1;return temp1.toString();}
    else {dp[index1][index2]=temp2;return temp2.toString();}
    }
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		String s=kb.next();
		String t=kb.next();
		dp=new StringBuilder[s.length()][t.length()];
		for(int i=0;i<dp.length;i++)
		for(int j=0;j<dp[i].length;j++)
		dp[i][j]=null;
		System.out.println(lcs(s,t,0,0));
		//System.out.println(longest);
	}
}
