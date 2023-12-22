import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		int s = 0;
		for(int i=0;i<n;i++){
			arr[i] = in.nextInt();
			s += arr[i];
		}
		int k = s / (n*(n+1)/2);
		if(s % (n*(n+1)/2) != 0){
			System.out.println("NO");
			return;
		}
		int[] d = new int[n-1];
		for(int i=1;i<n;i++){
			if(k - (arr[i] - arr[i-1]) < 0 || (k - (arr[i] - arr[i-1])) % n != 0){
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}
