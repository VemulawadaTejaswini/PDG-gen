import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int t = 1;
		int ans = 0;
		while(t<=10000000) {
			int temp = 0;
			for (int i = 0; i < arr.length; i++) {
				temp += t%arr[i];
			}
			if(temp>ans) ans =temp;
			t++;
		}
		System.out.println(ans);
	}
}	
