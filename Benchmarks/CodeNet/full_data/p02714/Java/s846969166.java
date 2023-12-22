import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int R = 0;
		int G = 0;
		int B = 0;
		int i,j;
		long ans;
		for(i = 0;i < N;i++){
			if(S.charAt(i) == 'R'){
				R++;
			}else if(S.charAt(i) == 'G'){
				G++;
			}else if(S.charAt(i) == 'B'){
				B++;
			}
		}
		ans = R * B * G;
		for(i = 0;(1 + i) + (1 + i) < N;i++){
			for(j = 0;j + 1 + i + 1 + i < N;j++){
				if(S.charAt(j) != S.charAt(j + 1 + i) && S.charAt(j + 1 + i) != S.charAt(j + 1 + i + 1 + i) && S.charAt(j) != S.charAt(j + 1 + i + 1 + i)){
					ans--;
				}
			}
		}
		System.out.println(ans);
	}
}