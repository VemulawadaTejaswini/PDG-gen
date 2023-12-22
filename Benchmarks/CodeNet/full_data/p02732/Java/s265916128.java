import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int arr[] = new int[N];
		int count[] = new int[N+1];
		int list[] = new int[N+1];

		for (int i = 0; i < N ; i ++){
			arr[i] = scan.nextInt();
			count[arr[i]] += 1;
		}

		list[0] = 0;
		list[1] = 0;
		for(int i = 2; i <= N; i++ ){
			list[i] = list[i - 1] + (i - 1);
		}

		for(int k = 0; k < N ; k ++){
			int k_num = arr[k];
			int sum = 0;
			count[k_num] -= 1;
			for (int i = 0; i <N ; i++){
				int num = count[i];
				sum += list[num];
			}
			count[k_num] += 1; 
			System.out.println(sum);
		}
	}
}