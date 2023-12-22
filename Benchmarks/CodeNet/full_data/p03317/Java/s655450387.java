import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();

		int arr[] = new int[N];
		int one = -1;
		for(int n=0;n<N;n++){
			arr[n] = sc.nextInt();
			if(arr[n] == 1) one = n;
			one = Math.min(one,N-one-1);
		}

		
			if(one<M || one > N-M-1){
				System.out.println((int)Math.ceil((float)(N-M)/(M-1))+1);	
			}
			else{
				System.out.println((int)(Math.ceil((one)/(float)(M-1)) + 
					Math.ceil((N-one-1-(one)%(float)(M-1))/(float)(M-1))));
			}
		

	}
}