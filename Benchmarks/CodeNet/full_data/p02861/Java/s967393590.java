import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;


	  
    // Function to swap the data 
    // present in the left and right indices 
     
    
public class Main{
	
	public static int[] swap(int data[], int left, int right) 
    { 
  
        // Swap the data 
        int temp = data[left]; 
        data[left] = data[right]; 
        data[right] = temp; 
  
        // Return the updated array 
        return data; 
    } 
  
    // Function to reverse the sub-array 
    // starting from left to the right 
    // both inclusive 
    public static int[] reverse(int data[], int left, int right) 
    { 
  
        // Reverse the sub-array 
        while (left < right) { 
            int temp = data[left]; 
            data[left++] = data[right]; 
            data[right--] = temp; 
        } 
  
        // Return the updated array 
        return data; 
    } 
  
    // Function to find the next permutation 
    // of the given integer array 
    public static void findNextPermutation() 
    { 
  
        // If the given dataset is empty 
        // or contains only one element 
        // next_permutation is not possible 
        
  
        int last = data.length - 2; 
  
        // find the longest non-increasing suffix 
        // and find the pivot 
        while (last >= 0) { 
            if (data[last] < data[last + 1]) { 
                break; 
            } 
            last--; 
        } 
  

  
        int nextGreater = data.length - 1; 
  
        // Find the rightmost successor to the pivot 
        for (int i = data.length - 1; i > last; i--) { 
            if (data[i] > data[last]) { 
                nextGreater = i; 
                break; 
            } 
        } 
  
        // Swap the successor and the pivot 
        data = swap(data, nextGreater, last); 
  
        // Reverse the suffix 
        data = reverse(data, last + 1, data.length - 1); 
 
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
	
	static class Pair
	{
		int p;
		int q;
		Pair(int p,int q)
		{
			this.p = p;
			this.q = q;
		}
	}
	
	static int gcd(int a,int b)
	{
		if(a == 0) return b;
		if(b == 0) return a;
		
		return gcd(b,a%b);
	}
	
	static boolean check(char x)
	{	
		if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') return false;
		return true;
	}
	
	static int fact(int n)
	{
		int ans = 1;
		while(n != 0)
		{
			ans = ans*n;
			n--;
		}
		return ans;
	}
	
	static String[] ar;
	static int u = 0;
	static void printPermutn(String str, String ans) 
    { 
  
        // If string is empty 
        if (str.length() == 0) {  
        	ar[u] = ans;
        	u++;
            return; 
        } 
  
        for (int i = 0; i < str.length(); i++) { 
  
            // ith character of str 
            char ch = str.charAt(i); 
  
            // Rest of the string after excluding  
            // the ith character 
            String ros = str.substring(0, i) +  
                         str.substring(i + 1); 
  
            // Recurvise call 
            printPermutn(ros, ans + ch); 
        } 
    } 
	public static int data[];
	public static void main(String[] args) 
	{
		OutputStream outputStream = System.out;
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(outputStream);
        
        int n = sc.nextInt();
        
        int x[] = new int[n+1];
        int y[] = new int[n+1];
        StringBuffer sb = new StringBuffer();
        for(int i = 1; i <= n; i++)
        {
        	x[i] = sc.nextInt();
        	y[i] = sc.nextInt();
        	sb.append(i); 
        }
        String s = sb.toString();
        int len = fact(n);
        //System.out.println(len);
        ar = new String[len];
        printPermutn(s,"");
        double ans = 0;
        for(int i = 0; i < len; i++)
        {	
        	double nans = 0;
        	for(int j = 0; j < ar[i].length()-1; j++)
        	{	
        		int x1 = x[Character.getNumericValue(ar[i].charAt(j))];
        		//System.out.println(Character.getNumericValue(ar[i].charAt(j)));
        		//System.out.println(Character.getNumericValue(ar[i].charAt(j+1)));
        		int x2 = x[Character.getNumericValue(ar[i].charAt(j+1))];
        		int y1 = y[Character.getNumericValue(ar[i].charAt(j))];
        		int y2 = y[Character.getNumericValue(ar[i].charAt(j+1))];
        		
        		long xx = (long)(x2-x1)*(x2-x1);
        		long yy = (long)(y2-y1)*(y2-y1);
        		nans += (double)Math.sqrt(xx + yy);
        		//System.out.println(x1+" "+x2+" "+y1+" "+y2+" "+ar[i]+" "+nans);
        	}
        	ans += nans;
        }
        
        ans = ans/len;
        
        out.println(ans);
        out.close();
	}

}
