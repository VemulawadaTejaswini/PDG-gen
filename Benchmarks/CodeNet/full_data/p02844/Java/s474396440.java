import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int hund,ten,one;
		int ans = 0;
		boolean[] list = new boolean[1000];
		Arrays.fill(list,false);
		for(int i = 0;i < N - 2;i++){
			for(int j = i + 1;j < N - 1;j++){
				for(int k = j + 1;k < N;k++){
					hund = S.charAt(i) - '0';
					ten = S.charAt(j) - '0';
					one = S.charAt(k) - '0';
					list[hund * 100 + ten * 10 + one] = true;
				}
			}
		}
		for(int i = 0;i < 1000;i++){
			if(list[i]){
				ans++;
			}
		}
		System.out.println(ans);
	}
}