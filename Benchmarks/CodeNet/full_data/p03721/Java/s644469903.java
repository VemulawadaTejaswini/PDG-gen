import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int arr[] = new int[100001];
		Arrays.fill(arr,0);
		
		for(int i=1; i<N+1; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[a]= arr[a]+b;
		}
		
		for(int i=1; i<100001; i++){
			if(K<=arr[i]){
				System.out.println(i);
				break;
			}
			else K=K-arr[i];
		}

	}
}