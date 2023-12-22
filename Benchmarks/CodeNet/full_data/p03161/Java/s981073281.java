import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Solution 
{public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(str.nextToken().trim());
		int m = Integer.parseInt(str.nextToken().trim());
		 int c[] = new int[n];
         str = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
		{
			c[i] = Integer.parseInt(str.nextToken().trim());
		}
        System.out.println(frog(c,m));
    }
public static int frog(int a[],int k)
    {
    	int n = a.length;
    	int ans[] = new int[n];
    	for(int i=1;i<n;i++)
    		ans[i]=Integer.MAX_VALUE;
    	for(int i=0;i<n;i++)
    	{
    		for(int j=1;j<=k;j++)
    		{
    			if(i+j>=n) break;
    			int val = Math.abs(a[j+i]-a[i]);
    			ans[i+j] = Math.min(ans[i+j],ans[i]+val);
     		}
    	}
    	return ans[n-1];
    }
}
