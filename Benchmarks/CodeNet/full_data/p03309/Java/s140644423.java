import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		int sum = 0;
		for(int n=0;n<N;n++){
			arr[n] = sc.nextInt();
			sum += arr[n]-n-1;
		}

		if(sum%N==0){
			int s=0;
			for(int n=0;n<N;n++){
				if(sum>0)
					s += Math.abs(arr[n]-n-1-sum/N);
				else
					s += Math.abs(arr[n]-n-1+sum/N);
			}
			System.out.println(s);
		}
		else{
			int s=0,t=0;
			for(int n=0;n<N;n++){
				s += Math.abs(arr[n]-n-1-sum/N);
				t += Math.abs(arr[n]-n-1-sum/N+1);
			}
			System.out.println(Math.min(s,t));
		}
	}
}