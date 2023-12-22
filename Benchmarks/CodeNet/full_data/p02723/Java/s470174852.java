// No sorceries shall previal. //         
import java.io.*;
import java.util.*;
     
public class _InVoker_ {
	static long mod = 1000000007;
	static long mod2 = 998244353;
    public static void sort(long arr[], int start, int end) { 		
		if(start>=end)
			return;		
		int mid=(start+end)/2;
		sort(arr,start,mid);
		sort(arr,mid+1,end);
		merge(arr,start,mid,end);	
	}	
	private static void merge(long arr[], int start, int mid, int end) {		
		int i, j=mid+1,c=0;
		long temp[]= new long[end-start+1];
		for(i=start;i<=mid && j<=end;c++) {
			if(arr[i]<=arr[j]) {
				temp[c]=arr[i];
				i++;
			}
			else {
				temp[c]=arr[j];
				j++;
			}
		}
		while(i<=mid) {
			temp[c]=arr[i];
			i++;c++;
		}
		while(j<=end) {
			temp[c]=arr[j];
			j++;c++;
		}
		c=0;
		for(i=start;i<=end;i++,c++)
			arr[i]=temp[c];
	}
	static long gcd(long a, long b) { 
      if (b == 0) 
        return a; 
      return gcd(b, a % b);  
    }
	static int gcd(int a, int b) { 
	      if (b == 0) 
	        return a; 
	      return gcd(b, a % b);  
	    }
	
	public static void main(String args[]) {	
    	Scanner inp=new Scanner(System.in);
    	PrintWriter out= new PrintWriter(System.out);
    	
    	String s=inp.next();
    	int n=s.length();
    	out.println(s.charAt(2)==s.charAt(3) && s.charAt(4)==s.charAt(5)?"Yes":"No");
    	
    	inp.close();
    	out.close();
    }	
}













