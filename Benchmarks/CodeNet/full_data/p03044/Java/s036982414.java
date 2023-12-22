import java.io.*;
import java.math.*;
import java.security.KeyStore.Entry;
import java.util.*;

public class Main {
	private static boolean[] vis;
	private static long[] dist;
	public static void merge(long arr[], int l, int m, int r) 
    { 
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        /* Create temp arrays */
        long L[] = new long [n1]; 
        long R[] = new long [n2]; 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
	 public static void sort(long arr[], int l, int r) 
	    { 
	        if (l < r) 
	        { 
	            // Find the middle point 
	            int m = (l+r)/2; 
	  
	            // Sort first and second halves 
	            sort(arr, l, m); 
	            sort(arr , m+1, r); 
	  
	            // Merge the sorted halves 
	            merge(arr, l, m, r); 
	        } 
	    } 
	 private static int gcd(int n, int l) {
	        if (l == 0)
	            return n;
	        return gcd(l, n % l);
	    }
	 public static void dfs(ArrayList<Pair>[] gr,int v)
	    {
	         vis[v]=true;
	         ArrayList<Pair> arr=gr[v];
	         for(int i=0;i<arr.size();i++)
	         {
	             if(!vis[arr.get(i).v])
	             {  
	            	 dist[arr.get(i).v]=dist[v]+arr.get(i).i;
	            	 dfs(gr,arr.get(i).v);
	             }
	         }
	    }
	 private static class Pair implements Comparable<Pair>{
	        int v,i;Pair j;
	        public Pair(int a,int b){
	            v=a;
	            i=b;
	        }
	        public Pair(int a,Pair b)
	        {
	            v=a;
	            j=b;
	        }
	        @Override
	        public int compareTo(Pair arg0) {
	            {
	            	return this.v-arg0.v;
	            }
	        }
	    }
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Pair>[] g=new ArrayList[n+1];
		for(int i=0;i<=n;i++)
			g[i]=new ArrayList<>();
		for(int i=0;i<n-1;i++)
		{
			int a=sc.nextInt();int b=sc.nextInt();int c=sc.nextInt();
			g[a].add(new Pair(b,c));
			g[b].add(new Pair(a,c));
		}
		vis=new boolean[n+1];
		dist=new long[n+1];
		Arrays.fill(vis, false);
		Arrays.fill(dist, 0);
		dfs(g,1);
		for(int i=1;i<=n;i++)
		{
			System.out.println(dist[i]%2);
		}
	}
}
