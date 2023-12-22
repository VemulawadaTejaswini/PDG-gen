import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String buf = " ";
		int N = S.length();
		int ans = 0;
		for(int i = 0;i < N;i++){
			for(int j = 0;j < i + 1;j++){
				buf = S.substring(j,N - i + j).replaceAll("[AGTC]","0");
				if(buf.matches("0*")){
					ans = S.substring(j,N - i + j).length();
					break;
				}
			}
			if(ans != 0){
				break;
			}
		}
		System.out.println(ans);
	}
}