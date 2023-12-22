import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	int a,b,c,d,e,f,k,l,m,n,x,y,z;
	long ans;
	String[] S;

	Main(){
		// 整数の入力
		n = sc.nextInt();
		S = new String[n];

		// 文字列の入力
		for(int i=0;i<n;i++){
			String s = sc.next();
			String[] ss = s.split("");
			Arrays.sort(ss);
			S[i]=ss[0];
			for(int j=1;j<10;j++){
				S[i] += ss[j];
			}
		}

		Arrays.sort(S);

		String str = S[0];
		long cnt = 1;
		for(int i=1;i<n;i++){
			if(!str.equals(S[i])){
				ans+=comv(cnt);
				cnt=0;
				str = S[i];
			}
			cnt++;
		}

		ans+=comv(cnt);

		// 出力
		System.out.println(ans);		
	}

	private long comv(long x){
		if(x==1)return 0;
		else return x*(x-1)/2;
	}

	public static void main(String[] args){
		new Main();
	}
}