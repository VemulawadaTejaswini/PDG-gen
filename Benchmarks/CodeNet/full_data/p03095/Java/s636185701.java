import java.util.*;

public class Main {
	Map<String,String> map = new HashMap<>();
	int N;
	String[] S;
	int cnt = 0;

	Main(int N,String[] S){
		this.N = N;
		this.S = S;

		for(int i=0;i<N;i++){
			cnt++;			//単体は問答無用で追加
			joint(S[i],1,i+1);
		}
		System.out.println(cnt%1000000007);
	}

	private void joint(String str,int m,int n){	//結合文字	結合個数	現在の添え字
		for(int j=n;j<N;j++){
			String sss = str+S[j];
			if(judge(sss)){			//結合判定
				cnt++;			//結合出来たらカウントアップして再帰呼び出し
				if(m<N)joint(sss,m+1,j+1);
			}
		}
	}

	private boolean judge(String str){	//文字列ジャッジメント。重複がなければtrue、あればfalse
		String sss = map.get(str);
		if(sss != null){
			switch(sss){
				case "true":
					return true;
				case "false":
					return false;
			}
		} else {
			int StrNum = str.length();
			boolean flg = true;
			sss = "true";
			for(int i=0;i<StrNum;i++){
				char c1 = str.charAt(i);
				for(int j=i+1;j<StrNum;j++){
					if(c1==str.charAt(j)){
						flg = false;
						sss = "false";
						break;
					}
				}
				if(!flg)break;
			}
			map.put(str,sss);
			return flg;
		}
		return false;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();			//N
		String[] S = new String[N];		//S
		int i = 0;
		for(char c:sc.next().toCharArray()){
			S[i++] = String.valueOf(c);
		}

		new Main(N,S);
	}
}