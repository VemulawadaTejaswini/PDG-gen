import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	static long x;
	static long remain;
	
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
	
	static class Subject
	{
		long b;
		long l;
		long u;
		long gainIfMax;
		long gainIfRemain;
		long gainIfEmpty;
		
		public void init()
		{
			gainIfMax = (x - b) * u;
			gainIfEmpty = -b * l;
		}
		
		private void init2()
		{
			gainIfRemain = (remain - b);
			if(gainIfRemain > 0)
				gainIfRemain *= u;
			else
				gainIfRemain *= l;
		}
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		FastReader e = new FastReader();
		
		int n = e.nextInt();
		x = e.nextLong();
		Subject[] subjects = new Subject[n];
		for(int i = 0; i < n; i++)
		{
			subjects[i] = new Subject();
			subjects[i].b = e.nextLong();
			subjects[i].l = e.nextLong();
			subjects[i].u = e.nextLong();
			subjects[i].init();
		}
		
		Arrays.sort(subjects, new Comparator<Subject>() {
			public int compare(Subject o1, Subject o2)
			{
				return Long.compare(o2.gainIfMax - o2.gainIfEmpty, o1.gainIfMax - o1.gainIfEmpty);
			}
		});
		
		long left = -1;
		long right = x * n;
		while(right - left > 1)
		{
			long middle = (left + right) / 2;
			int whole = (int)(middle / x);
			remain = middle % x;
			long delta = 0;
			for(int i = 0; i < whole; i++)
			{
				delta += subjects[i].gainIfMax;
			}
			
			for(int i = whole; i < n; i++)
			{
				delta += subjects[i].gainIfEmpty;
			}
			
			long bestDelta;
			if(remain == 0)
			{
				bestDelta = delta;
			}
			else
			{
				bestDelta = Long.MIN_VALUE;
				for(int i = 0; i < n; i++)
				{
					subjects[i].init2();
					if(i < whole)
					{
						bestDelta = Math.max(bestDelta, delta - subjects[i].gainIfMax + subjects[i].gainIfRemain + subjects[whole].gainIfMax - subjects[whole].gainIfEmpty); 
					}
					else
					{
						bestDelta = Math.max(bestDelta, delta - subjects[i].gainIfEmpty + subjects[i].gainIfRemain);
					}
				}
			}
			if(bestDelta >= 0)
			{
				right = middle;
			}
			else
			{
				left = middle;
			}
		}
		
		System.out.println(right);
	}
}