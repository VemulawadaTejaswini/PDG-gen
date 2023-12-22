import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Long N = sc.nextLong();
		Long ans = 0;
		for(int i = 1;i < N+1;i++){
			if(N % 3 != 0 && N % 5 != 0){
				ans++;
			}
		}
		System.out.println(ans);
	}
}