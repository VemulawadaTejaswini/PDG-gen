
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int m=scn.nextInt();
		int [][]arr=new int[n][2];
		for(int i=0;i<n;i++) {
			arr[i][0]=scn.nextInt();
			arr[i][1]=scn.nextInt();
		}
		Arrays.sort(arr, new Comparator<int[]>() { 
            
	          @Override              
	          // Compare values according to columns 
	          public int compare(final int[] entry1,  
	                             final int[] entry2) { 
	  
	            // To sort in descending order revert  
	            // the '>' Operator 
	            if (entry1[0] > entry2[0]) 
	                return 1; 
	            else
	                return -1; 
	          } 
	        });  // End of function call sort(). 
		
		
		double tot=0;
		for(int i=0;i<n&&m>0;i++) {
			//System.out.println(m);
			if(arr[i][1]<=m) {
				//System.out.println("kkkk");
				m-=arr[i][1];
				tot+=(double)arr[i][0]*(double)arr[i][1];
			}else {
				tot+=(double)arr[i][0]*(double)m;
				m=0;
			}
		}
		String d=new DecimalFormat("#").format(tot);

		System.out.println(d);
	    } 
	      
	

}
