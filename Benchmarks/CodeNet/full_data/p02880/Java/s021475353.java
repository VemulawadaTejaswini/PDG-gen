
import java.io.*;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer; 
import java.util.*;


public  class Main 
{

	   
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
	            while (st == null || !st.hasMoreTokens()) 
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

			public Character charAt(int i) {
				// TODO Auto-generated method stub
				return null;
			} 
	    } 

  

	  // Complete the hurdleRace function below.
//    public static void solve() {
//    	FastReader s=new FastReader();
	    int binarySearch(int arr[], int l, int r, int x) 
	    { 
	        if (r >= l) { 
	            int mid = l + (r - l) / 2; 
	  
	            // If the element is present at the 
	            // middle itself 
	            if (arr[mid] == x) 
	                return mid; 
	  
	            // If element is smaller than mid, then 
	            // it can only be present in left subarray 
	            if (arr[mid] > x) 
	                return binarySearch(arr, l, mid - 1, x); 
	  
	            // Else the element can only be present 
	            // in right subarray 
	            return binarySearch(arr, mid + 1, r, x); 
	        } 
	  
	        // We reach here when element is not present 
	        // in array 
	        return -1; 
	    } 
	  
	    static // Driver method to test above 

	// Java implementation of iterative Binary Search 

	    // Returns index of x if it is present in arr[], 
	    // else return -1 
	    int lowerBound(int[] a,int n,int key){
	        int s =0,e=n-1;
	        int ans = -1;

	        while(s<=e){
	            int mid = (s+e)/2;

	            if(a[mid]==key){
	                ans = mid;
	                e = mid - 1;
	            }
	            else if(a[mid]>key){
	                e = mid - 1;
	            }
	            else{
	                s = mid + 1;
	            }
	        }

	        return ans;
	    }

    public static void main(String[] args) throws IOException {
    	FastReader s=new FastReader();
   			int n = s.nextInt();
   			int c=0,flag=0;
   			for(int i=1;i<=9 && flag==0;i++) {
   				if(n%i==0 && n/i<=9 && n/i>=1)flag=1;
   			}
   			if(flag==1)System.out.println("Yes");
   			else System.out.println("No");
    }	
}





        
    

      
 