import java.io.*;
import java.util.*;
 
public class Main {
	static int binsearch(int arr[], int f, int l, int val)
    {
        if(f<=l)
        {
            int mid = (f+l)/2;
            if(arr[mid]==val)
                return binsearch(arr,f,mid-1,val);
            if(arr[mid]<val)
                return Math.max(mid,binsearch(arr,mid+1,l,val)); 
            if(arr[mid]>val)
                return binsearch(arr,f,mid-1,val);
        }
        return -1;
    }
    public static int lengthOfLIS(int[] nums) {
        if(nums.length==0)
            return 0;
        int ending[] = new int[nums.length];
        ending[0] = nums[0];
        int last = 0;
        int less;
        for(int i=1;i<nums.length;i++)
        {
            less = binsearch(ending,0,last,nums[i]);
            last = Math.max(last,less+1);
            ending[less+1] = nums[i];
        }
        return last+1;
    }
	public static void main(String[] args)throws IOException {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
		int n = in.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		int val = 1;
		int kitne = 0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==val)
			{
				kitne++;
				val++;
			}
		}
		if(kitne==0)
			out.println(-1);
		else
			out.println(n-kitne);
		out.close();
	}
    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }

}