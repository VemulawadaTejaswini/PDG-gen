package AtCoderBeginnerContest112;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args)
	{
		List<Point> points = new ArrayList<Point>();
		FastReader in = new FastReader();
		int num = in.nextInt();
		
		int x1 = in.nextInt(), y1 = in.nextInt(), h1 = in.nextInt();
		for(int i = 1; i < num; i++)
		{
			int x2 = in.nextInt();
			int y2 = in.nextInt();
			int h2 = in.nextInt();
			
			int dh = h1-h2;
			
			
			ArrayList<Point> temp = new ArrayList<Point>();
			System.out.println("\n"+i + " " + Arrays.toString(points.toArray()) + "\n" + Arrays.toString(temp.toArray()) + "\n");
			if(i == 1)
			{
				for(int j = 0; j < 100; j++)
				{
					for(int k = 0; k < 100; k++)
					{
						if(Math.abs(x1-j) + Math.abs(y1-k) - dh ==  Math.abs(x2-j) + Math.abs(y2-k))
						{
							if(!points.contains(new Point(j,k)))
							{
								points.add(new Point(j,k));
							}
						}
					}
				}
			}
			else
			{
				for(Point p : points)
				{
					int j = p.x;
					int k = p.y;
					if(Math.abs(x1-j) + Math.abs(y1-k) - dh !=  Math.abs(x2-j) + Math.abs(y2-k))
					{
						temp.add(p);
					}
				}
				for(Point p : temp)
					points.remove(p);
			}
			
			System.out.println("\n"+i+"-1" + " " + Arrays.toString(points.toArray()) + "\n" + Arrays.toString(temp.toArray()) + "\n");
			
			if(points.size() == 1)
			{
				int x = points.get(0).x;
				int y = points.get(0).y;
				System.out.println(points.get(0).x + " " + points.get(0).y + " " + (h1 + Math.abs(x1 - x) + Math.abs(y1 - y)));
				return;
			}
			
			
			x1 = x2;
			y1 = y2;
			h1 = h2;
		}
	}
	
	static class FastReader 
    { 
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