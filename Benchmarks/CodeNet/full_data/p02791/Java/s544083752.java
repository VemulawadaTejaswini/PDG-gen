import java.util.*;

class Main{
	public static void main(String[] args){
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i < n; ++i){
			arr[i] = sc.nextInt();
		}
		long max_now = arr[0];
		int ans = 1;
		for(int i = 1;i < n; ++i){
			if(arr[i] <= max_now){
				ans++;
			}
			max_now = Math.min(max_now,arr[i]);
		}
		System.out.println(ans);
	}
}