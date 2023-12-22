import java.util.*;

public class Main{
	public static void main(String[] artgs){
		Scanner sc = new Scanner(System.in);
		String[] arr = sc.nextLine().split(" ");
		int N = Integer.parseInt(arr[0]);
		int K = Integer.parseInt(arr[1]);
		arr = sc.nextLine().split(" ");
		int[] A = new int[N];
		for (int i = 0; i < A.length; i++){
			A[i] = Integer.parseInt(arr[i]);
		}
		sc.close();

		int res = 1+(int)Math.ceil((double)(N-K)/(K-1));
		System.out.println(res);
	}
}
