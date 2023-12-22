import java.util.Scanner;

public class xor {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		int n;
		n = s.nextInt();
		
		int[] a = new int[n];
		for(int i = 0; i < n; ++i){
			a[i] = s.nextInt();
		}
		
		int cnt = 0;
		if(a[0] == (a[n-1] ^ a[1])) cnt++;
		for(int i = 1; i < n-1; ++i){
			if(a[i] == (a[i-1] ^ a[i+1])){
				cnt++;
			}
		}
		if(a[n-1] == (a[n-2] ^ a[0])) cnt++;
		
		if(n == cnt){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}