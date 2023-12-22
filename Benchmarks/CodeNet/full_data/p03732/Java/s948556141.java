import java.util.*;
public class Main
{   
    public static void main(String[] args)
    {
    	
        Scanner s=new Scanner(System.in);
        
        long ans=0,x,y,w,last=0;
        int n,q;
        n=s.nextInt();
        w=s.nextLong();
        
        ArrayList<Long>U=new ArrayList<Long>();
        ArrayList<Long>V=new ArrayList<Long>();
        //Vector<Long>V=new Vector<Long>();
        
        for(int i=1;i<=n;i++)
        {
        	q=0;
        	x=s.nextLong();
        	y=s.nextLong();
            if(x>w)
            continue;
            
            for(int j=0;j<last;j++)
            {
            	
            	if((U.get(j)+x)<=w)
            	{
            		U.add(U.get(j)+x);
            		V.add(V.get(j)+y);
            		q++;
            	}
            }
            U.add(x);
    		V.add(y);
    		q++;
    		last+=q;
        }
        
       // System.out.println("sz="+last);
        
        for(int i=0;i<last;i++)
        {
        	if((V.get(i)>ans) && ((U.get(i))<=w))
                ans=V.get(i);
        }
        System.out.println(ans);
       // System.gc();
        s.close();
    }
}