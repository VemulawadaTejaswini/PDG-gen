import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int n=3;
	int arr[]=new int[n];
	readArray(arr,sc);
	Arrays.sort(arr);
	if(arr[n-1]!=arr[n-2]) {
		System.out.println("YES");
	}else {
		System.out.println("NO");
	}
		

	}
	
	static void readArray(int[] arr,Scanner sc) { 
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
	}
	
	
	

}
