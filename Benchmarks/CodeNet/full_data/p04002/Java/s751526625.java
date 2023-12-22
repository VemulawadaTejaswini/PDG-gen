import java.util.*;

public class Main {
	
       public static void main(String[] args) {
    	  Scanner in=new Scanner( System.in)	;
          long n=in.nextLong(),m=in.nextLong(),k=in.nextLong();
          //HashMap<pointt,Long> map=new HashMap<pointt,Long>();
          TreeMap<pointt,Long> map=new TreeMap<pointt,Long>();
          for(int i=1;i<=k;i++)
          {
        	 int a=in.nextInt();
        	 int b=in.nextInt();
        	 for(int x=Math.max(1, a-2);x<=Math.min(n-2, a);x++)
        		 for(int y=Math.max(1, b-2);y<=Math.min(m-2, b);y++)
        		 {
        			 pointt p=new pointt(x, y);
                	 Long v=map.get(p);
                	// System.out.println(v);
                	 if(v==null)
                	 {
                		 v=(long) 1;
                	 }
                	 else v++;
                	 
                	
                	 map.put(p, v);
                	// System.out.println(x+"  "+y);
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
class pointt {
    int x,y;

	public pointt(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		pointt other = (pointt) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	 public int compareTo(pointt p) {
		    if (this.x != p.x) {
		      return this.x - p.x;
		    }
		    return this.y - p.y;
		  }
	
	
	
}
