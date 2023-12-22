import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), K = sc.nextInt();
		int R = sc.nextInt(), S = sc.nextInt(), P = sc.nextInt();
		String T = sc.next(); 
		sc.close();
		
		char ans[] = new char[N];
		for(int i=0;i<T.length();i++) {
			if(T.charAt(i)=='r')ans[i]='p';
			else if(T.charAt(i)=='s')ans[i]='r';
			else ans[i]='s';
		}
		for(int i=0;i<N;i++) {
			if(i+K<N && ans[i]==ans[i+K]) {
				ans[i+K]='z';
			}
		}
		
		long res = 0;
		for(int i=0;i<N;i++) {
			if(ans[i]=='r')res+=R;
			if(ans[i]=='s')res+=S;
			if(ans[i]=='p')res+=P;
		}
		System.out.println(res);
	}
}
