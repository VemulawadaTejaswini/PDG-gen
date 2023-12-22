import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Main {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0 ;
	    int arr[] = new int[n];
	    int arr2[] = new int[n];
	    for(int  i = 0 ; i < n ; i ++) {
	    	arr[i] = scan.nextInt();
	    }
	    for(int  i = 0 ; i < n ; i ++) {
	    	arr2[i] = scan.nextInt();
	    }
	    int max = 0 ;int j =0 ;
	    for(int k = 1 ; k < n-1 ; k++) {
	    	for(int i = 1 ;  i <n ;i++ ) {
	    		if(sum(arr,j,i,k) - sum(arr2,j,i,k) > max) {
	    			max = sum(arr,j,i,k) - sum(arr2,j,i,k) ;
	    			
	    		}
	    	}
	    	j++;
	    }
	    System.out.print(max);

	}
	static int sum(int[] arr ,int a ,int b , int k) {
		int sum = 0 ;
		if(k>1) {
			for(int i = a ; i<= b ; i++) {
				sum+=arr[i];
			}
		}else {
			sum = arr[a]+arr[b];
		}
		return sum ;
	}
}	