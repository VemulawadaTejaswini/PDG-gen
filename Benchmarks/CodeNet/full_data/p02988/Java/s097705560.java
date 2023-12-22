import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		int res = 0;
		for(int i = 1; i < n-1; i++){
			int[] three = new int[3];
			three[0] = arr[i];
			three[1] = arr[i-1];
			three[2] = arr[i+1];
			Arrays.sort(three);
			if(three[1] == arr[i]) res++;
		}
		System.out.println(res);
	}

}
