import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int s[] = new int[M];
		int c[] = new int[M];
		
		for(int i = 0; i < M; i++){
			s[i] = sc.nextInt() - 1;
			c[i] = sc.nextInt();
		}
		
		int ans = -1;
		for(int n = (int)Math.pow(10, N-1); n < (int)Math.pow(10, N); n++){
			String str = String.valueOf(n);
			boolean flag = false;
			for(int j = 0; j < M; j++){
				if(str.charAt(s[j])-'0' != c[j]){
					flag = true;
					break;
				}
			}
			if(flag)continue;
			else {
				ans = n;
				break;
			}
		}
		
		System.out.println(ans);
	}
}