

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String [] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		 int n =Integer.valueOf(br.readLine());
		 String [] z =br.readLine().split(" ");
		 String nums1 =z[0];
		 String nums2 =z[1];
		
         for(int i=0;i<n;i++) {
        	 System.out.print(nums1.charAt(i));
        	  System.out.print(nums2.charAt(i));
		 }
    
 
}
}