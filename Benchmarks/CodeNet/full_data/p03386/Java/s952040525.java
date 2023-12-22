import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 int k = sc.nextInt();
		 int j = 0;
		 int n = 0;
		 
		 
		 int arr[] = new int[b - a + 1];
		
		 for(int i = a; i <= b; i ++) {
			 arr[n] = i;
			 n ++;
		 }
		 
		 for(int i = 0; i < k; i ++) {
			  System.out.println(arr[i]);
			  j = arr[i];
			  if(i == arr.length - 1) {
				  break;
			  }
		 }
		 
		 List<Integer> h = new ArrayList<Integer>();
		 
		 for(int i = 0; i < k; i ++) {
			 if(arr[arr.length - 1 - i] > j) {
				 h.add(arr[arr.length - 1 - i]);
		     }else if(i == arr.length - 1) {
					  break;
		     }
			 
		 }
		 Collections.sort(h);
		for(int i = 0; i < h.size(); i ++) {
			System.out.println(h.get(i));
		}
	}
}