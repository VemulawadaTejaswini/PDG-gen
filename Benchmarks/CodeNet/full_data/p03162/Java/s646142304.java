import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{       static PrintWriter out=new PrintWriter(System.out);static FastScanner in = new FastScanner(System.in);static class FastScanner {BufferedReader br;StringTokenizer stok;FastScanner(InputStream is) {br = new BufferedReader(new InputStreamReader(is));}
        String next() throws IOException {while (stok == null || !stok.hasMoreTokens()) {String s = br.readLine();if (s == null) {return null;}
                stok = new StringTokenizer(s);}return stok.nextToken();}
        int ni() throws IOException {return Integer.parseInt(next());}long nl() throws IOException {return Long.parseLong(next());}double nd() throws IOException {return Double.parseDouble(next());}char nc() throws IOException {return (char) (br.read());}String ns() throws IOException {return br.readLine();}
        int[] nia(int n) throws IOException{int a[] = new int[n];for (int i = 0; i < n; i++)a[i] = ni();return a;}long[] nla(int n) throws IOException {long a[] = new long[n];for (int i = 0; i < n; i++)a[i] = nl();return a;}
        double[] nda(int n)throws IOException {double a[] = new double[n];for (int i = 0; i < n; i++)a[i] = nd();return a;}int [][] imat(int n,int m) throws IOException{int mat[][]=new int[n][m];for(int i=0;i<n;i++){for(int j=0;j<m;j++)mat[i][j]=ni();}return mat;}
    }
	static long mod=Long.MAX_VALUE;
	public static void main (String[] args) throws java.lang.Exception
	{   int i,j;
	    HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		/*  if(hm.containsKey(z))
		        hm.put(z,hm.get(z)+1);
		    else
		        hm.put(z,1);
		 */       
        ArrayList<Integer> arr=new ArrayList<Integer>();
        HashSet<Integer> set=new HashSet<Integer>();
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        int n=in.ni();
        long a[][]=new long[3][n+1];
        for(i=0;i<n;i++)
        {   a[0][i]=in.nl();
            a[1][i]=in.nl();
            a[2][i]=in.nl();
        }
        long ans[][]=new long[3][n+1];
        for(i=1;i<n;i++)
            for(j=0;j<3;j++)
                ans[j][i]=Integer.MIN_VALUE;
        ans[0][0]=a[0][0];
        ans[1][0]=a[1][0];
        ans[2][0]=a[2][0];
        for(i=0;i<3;i++)
            for(j=0;j<3;j++)
                ans[i][1]=Math.max(ans[i][1],ans[j][0]+a[i][1]);
        for(i=2;i<=n;i++)
        {   for(j=0;j<3;j++)
            {   for(int k=0;k<3;k++)
                {   
                    if(j==k)
                        continue;
                    ans[j][i]=Math.max(ans[j][i],ans[k][i-1]+a[j][i]);
                }
            }
        }
        //for(i=0;i<n;i++)
        //{    for(j=0;j<3;j++)
        //        out.print(ans[j][i]+" ");
        //    out.println();    
        //}
        long temp=Math.max(ans[0][n-1],Math.max(ans[1][n-1],ans[2][n-1]));
        out.println(temp);
        
        out.close();
	}
	static class pair implements Comparable<pair>{
		int x, y;
		public pair(int x, int y){this.x = x; this.y = y;}
		@Override
		public int compareTo(pair arg0) 
		{   if(x<arg0.x)    return -1;
		    else if(x==arg0.x)
		    {   if(y<arg0.y)    return -1;
		        else if(y>arg0.y)   return 1;
		        else    return 0;
		    }
		    else    return 1;
		}
		public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof pair)) return false;
        pair key = (pair) o;
        return x == key.x && y == key.y;}
        public int hashCode() {int result = x;result = 31 * result + y;return result;}
	}
	static long gcd(long a,long b)
	{   if(b==0)
	        return a;
	    return gcd(b,a%b);    
	}
	static long exponent(long a,long n)
	{   long ans=1;
	    while(n!=0)
	    {   if(n%2==1)
	            ans=(ans*a)%mod;
	       a=(a*a)%mod;
	       n=n>>1;
	    }
	    return ans;
	}
	static int binarySearch(int a[], int item, int low, int high) 
    {   if (high <= low) 
            return (item > a[low])?  (low + 1): low; 
        int mid = (low + high)/2; 
        if(item == a[mid]) 
            return mid+1; 
        if(item > a[mid]) 
            return binarySearch(a, item, mid+1, high); 
        return binarySearch(a, item, low, mid-1); 
    } 
    static void merge(int arr[], int l, int m, int r) {   
        int n1 = m - l + 1; int n2 = r - m; int L[] = new int [n1]; int R[] = new int [n2]; 
        
        for (int i=0; i<n1; ++i) L[i] = arr[l + i]; for (int j=0; j<n2; ++j) R[j] = arr[m + 1+ j]; int i = 0, j = 0; int k = l; while (i < n1 && j < n2) {   if (L[i] <= R[j]) {   arr[k] = L[i]; i++; } else{   arr[k] = R[j]; j++; } k++; } while (i < n1){   arr[k] = L[i]; i++; k++; } while (j < n2) { arr[k] = R[j];   j++;     k++; } 
    } 
    static void Sort(int arr[], int l, int r) {if (l < r) {   int m = (l+r)/2; Sort(arr, l, m); Sort(arr , m+1, r); merge(arr, l, m, r); } } 
    
    static void sort(int a[])
    {Sort(a,0,a.length-1);}
}