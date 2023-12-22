 
import java.util.Scanner;

 class Main{
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in) ;
		int n = scan.nextInt();
		long arr2[] = new long[n] ;
		long arr1[] = new long[n-1] ; 
		for(int i = 0 ; i < n-1 ; i++) {
			arr1[i] = scan.nextInt();
		}
		arr2[arr2.length-1] = arr1[arr1.length -1] ;
		for(int i = arr2.length-2 ; i>0 ; i--) {
			if(arr1[i-1] <=arr2[i+1]) {
				arr2[i] = arr1[i-1];
			}else {
				arr2[i] = arr2[i+1];
			}
			//System.out.println(i) ;
		}
		arr2[0] = arr2[1] ;
		long sum = 0 ;
		for(int i = 0 ; i <arr2.length ; i++) {
			sum+=arr2[i] ;
		}
		System.out.println(sum) ;
	}
}
