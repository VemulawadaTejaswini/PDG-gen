import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	int a,b,c,d,e,f,k,l,r,m,n,x,y,z;
	int num;
	int[] ans;
	String[] S;

	Main(){
		// 文字列の入力
		String s = sc.next();
		num = s.length();
		ans = new int[num];

		S = s.split("");

		n=0;
		if(S[0].equals("L")){
			while(S[n].equals("L")){
				n++;
			}
			ans[0]=n;
		}
		
		if(S[0].equals("R")&&S[1].equals("L")){
			m=0;
			l=1; r=1;
		} else {
			while(n<num-1&&S[n].equals("R")){
				n++;
				r++;
			}
			m=n-1;
		}

		for(;n<S.length-1;n++){
			if(S[n].equals("R")&&S[n+1].equals("L")){
				ans[m]+=r%2==1?r/2+1:r/2;
				ans[m]+=l/2;
				ans[m+1]+=r/2;
				ans[m+1]+=l%2==1?l/2+1:l/2;
				m+=(r+l);
				r=0;
				l=0;
			}
			if(S[n].equals("R"))r++;
			if(S[n].equals("L"))l++;
		}
		if(S[n-1].equals("R"))ans[n-1]=r;
		else {
			ans[m]+=r%2==1?r/2+1:r/2;
			ans[m]+=l/2;
			ans[m+1]+=r/2;
			ans[m+1]+=l%2==1?l/2+1:l/2;
		}

		// 出力
		for(int t:ans)
			System.out.print(t+" ");
	}

	public static void main(String[] args){
		new Main();
	}
}