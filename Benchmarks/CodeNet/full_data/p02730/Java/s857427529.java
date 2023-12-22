import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static int[] S ;
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		String[] S = new String[W.length()];
		for(int i=0;i<W.length();i++){
			S[i] = String.valueOf(W.charAt(i));
		}

		boolean flg = true;
		for(int i=0,k=S.length-1;i<S.length;i++,k--){
			if(i>=k){
				break;
			}
			if(S[i].equals(S[k])){

			}else{
				flg = false;
				break;
			}

		}
		for(int i=0,k=((S.length-1)/2)-1;i<S.length;i++,k--){
			if(i>=k){
				break;
			}
			if(S[i].equals(S[k])){

			}else{
				flg = false;
				break;
			}

		}

		for(int i=((S.length+3)/2)-1,k=S.length-1;i<S.length;i++,k--){
			if(i>=k){
				break;
			}
			if(S[i].equals(S[k])){

			}else{
				flg = false;
				break;
			}

		}
		String ans ;
		if(flg){
			ans = "Yes";
		}else{
			ans = "No";
		}
		System.out.println(ans);
	}


}
