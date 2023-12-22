import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String Wd = in.readLine();
		int H = Integer.parseInt(Wd);

		Wd = in.readLine();
		int W = Integer.parseInt(Wd);

		Wd = in.readLine();
		int N = Integer.parseInt(Wd);

		int ans = 0;
		int black=0;
		while(true){
			if(H<W){
				black+=W;
				ans++;
				H--;
			}else{
				black+=H;
				ans++;
				W--;
			}
			if(black >=N){
				break;
			}
		}
		System.out.println(ans);

	}

}
