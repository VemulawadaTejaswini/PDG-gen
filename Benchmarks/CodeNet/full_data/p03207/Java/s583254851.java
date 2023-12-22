import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		for(int n=0;n<N;n++){
			arr[n] = sc.nextInt();

		}
		Arrays.sort(arr);
		int sum=0;
		for(int n=0;n<N;n++){
			if(n==N-1){
				sum += (int)arr[n]/2;
			}
			else{
				sum += arr[n];
			}
		}

		System.out.println(sum);

	}
}