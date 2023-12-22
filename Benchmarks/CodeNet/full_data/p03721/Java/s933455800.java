import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 int k = sc.nextInt();
     int []a = new int[n]; 
     int []b = new int[n]; 
 	 List<Integer> arr = new ArrayList<Integer>();
 	 for(int i=0;i<n;i++) {
 		 a[i]=sc.nextInt();
 		 b[i]=sc.nextInt();
 	 }
 	 sc.close();
 	 for(int i=0;i<a.length;i++) {
 		 for(int j=0;j<b[i];j++) {
 			arr.add(a[i]);
 		 }
 	 }
 	  Integer []aaa = new Integer[arr.size()];
 	  
 	    arr.toArray(aaa);
 	    Arrays.sort(aaa,Comparator.naturalOrder());
 	 
	 int ans = aaa[k-1];
	 
	 System.out.println(ans);
	
	 
	 
	}

}