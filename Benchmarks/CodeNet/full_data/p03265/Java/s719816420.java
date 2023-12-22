import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        FastReader in = new FastReader();
        
		int x1 = in.nextInt();
		int y1 = in.nextInt();
		int x2 = in.nextInt();
		int y2 = in.nextInt();
		
		int dist = (x1!=x2) ? Math.abs(x1-x2) :Math.abs(y1-y2);
		int x3,x4,y3,y4;
		
		if(y1==y2){
			if(x1<x2){
				x3 = x2;
				y3 = y2-dist;
				x4 = x1;
				y4 = y3;
			}else{
				x3 = x2;
				y3 = y2+dist;
				x4 = x1;
				y4 = y3;
			}
		}else{
			if(y2<y1){
				x3 = x2+dist;
				y3 = y2;
				x4 = x3;
				y4 = y1;
			}else{
				x3 = x2-dist;
				y3 = y2;
				x4 = x1-dist;
				y4 = y3-dist;
			}
		}
        
		System.out.print(x3 +" "+y3+" "+x4 +" "+y4);

    }
    
    static class FastReader  {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt()
        {
            return Integer.parseInt(next());
        }
 
        long nextLong()
        {
            return Long.parseLong(next());
        }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}
