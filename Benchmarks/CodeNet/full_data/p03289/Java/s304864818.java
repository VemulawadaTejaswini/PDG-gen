import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();

		if(S.charAt(0) != 0x41){
			System.out.println("WA");
			return;
		}
		if(!(S.charAt(1)>0x60 && S.charAt(1)<0x7B)){
			System.out.println("WA");
			return;
		}
		int cnt = 0;
		for(int i=2;i<S.length()-1;i++){
			if(S.charAt(i) == 'C'){
				cnt++;
			}else if(!(S.charAt(i)>0x60 && S.charAt(i)<0x7B)){
				System.out.println("WA");
				return;
			}
		}
		if(cnt  != 1){
			System.out.println("WA");
			return;
		}
		if(!(S.charAt(S.length()-1)>0x60 && S.charAt(S.length()-1)<0x7B)){
			System.out.println("WA");
			return;
		}
		System.out.println("AC");
	}

}
