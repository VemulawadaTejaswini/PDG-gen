import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		int arr[] = new int[N];

		for(int n=0;n<N;n++){
			arr[n] = sc.nextInt();
		}
		Arrays.sort(arr);
		int min = -1;
		for(int n=0;n<N-K+1;n++){
			if(n==0) min = arr[K-1] - arr[0];
			else{
				if(min > arr[K-1+n] - arr[n]){
					min = arr[K-1+n] - arr[n];
				}
			}
		}
		System.out.println(min);
	}
}