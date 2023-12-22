
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ary = new int[n];
		for(int i = 0; i < n; i++){
			ary[i] = -1;
		}
		int m = sc.nextInt();
		boolean isPossible = true;
		for(int i = 0; i < m; i++){
			int s = sc.nextInt();
			int c = sc.nextInt();
			if(ary[s - 1] != c && ary[s - 1] != -1){
				isPossible = false;
			}else{
				ary[s - 1] = c;
			}
		}
		if(n > 1 && ary[0] == 0){
			isPossible = false;
		}
		if(ary[0] == -1){
			ary[0] = 1;
		}
		for(int i = 1; i < n; i++){
			if(ary[i] == -1){
				ary[i] = 0;
			}
		}
		String ans = "";
		for(int i = 0; i < n; i++){
			ans += ary[i];
		}
		System.out.println(isPossible ? ans : "-1");
	}
}
