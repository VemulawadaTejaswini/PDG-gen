import java.util.*;
import java.io.*;
import java.math.*;

class Main
{
	public static void main (String[] args) throws Exception
	{
		// your code goes here
		BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(bu.readLine());
		int i,j,blue=0;
		char s[]=bu.readLine().toCharArray();
		ArrayList<Integer> r=new ArrayList<>();
		ArrayList<Integer> g=new ArrayList<>();
		
		for(i=0;i<n;i++)
		{
			if(s[i]=='R') r.add(i);
			else if(s[i]=='G') g.add(i);
			else blue++;
		}
		if(r.size()==0 || g.size()==0 || blue==0) {System.out.print("0"); return;}
		long ans=0;
		for(i=0;i<r.size();i++)
		for(j=0;j<g.size();j++)
		{
			int x=r.get(i),y=g.get(j);
			int diff=y-x,pt=y+diff,pt2=x-diff,m=0;
			if(pt>=0 && pt<n && s[pt]=='B') m++;
			if(pt2>=0 && pt2<n && s[pt2]=='B') m++;
			int start=0,end=0,pt3=0;
			start=x<y?x:y;
			end=x+y-start;
			pt3=start+(end-start)/2;
			if(((end-start-1)%2==1) && s[pt3]=='B') m++;
			ans=ans+blue-m;
		}
		System.out.print(ans);
	}
}