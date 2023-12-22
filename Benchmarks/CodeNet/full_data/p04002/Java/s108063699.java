import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	  static int MOD=1000000007;
	 
      public static void main(String[] args) {
    	  Scanner in=new Scanner( new BufferedReader(new InputStreamReader(System.in)))	;
          long n=in.nextLong(),m=in.nextLong(),k=in.nextLong();
          TreeMap<point,Long> map=new TreeMap<point,Long>();
          for(int i=1;i<=n;i++)
          {
        	 int a=in.nextInt();
        	 int b=in.nextInt();
        	 for(int x=Math.max(1, a-2);x<=Math.min(n-2, a);x++)
        		 for(int y=Math.max(1, b-2);y<=Math.min(m-2, b);y++)
        		 {
        			 point p=new point(x, y);
                	 Long v=map.get(p);
                	 if(v==null)
                	 {
                		 v=(long) 1;
                	 }
                	 else v++;
                	 map.put(p, v);
        		 }
        	 
          }
          long[] ans=new long[15];
          ans[0]=(n-2)*(m-2);
          
          for(long value:map.values())
          {
        	  ans[(int) value]++;
              ans[0]--;  
          }
          for(int i=0;i<=9;i++)
          {
        	  System.out.println(ans[i]);
          }
	}
}

 class point {
    int x,y;

	public point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
    
}
