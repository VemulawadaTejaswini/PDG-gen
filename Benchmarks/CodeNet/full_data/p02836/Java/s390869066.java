import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int N = S.length();
		int cnt = 0;
		for(int i = 0 ; i < N / 2 ; ++i){
			if(S.charAt(i) == S.charAt(N - 1 - i)){
				
			}else{
				++cnt;
			}
		}
		System.out.println(cnt);
	}
}
