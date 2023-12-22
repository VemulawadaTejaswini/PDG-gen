import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*Atcoder用
 * 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmp = br.readLine().split(" ");
		int a = Integer.parseInt(tmp[0]);
		int b = Integer.parseInt(tmp[1]);
		int c = Integer.parseInt(tmp[2]);


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String get = br.readLine();
		char[] s = get.toCharArray();
		for(char c:s)System.out.println(c);

		List<Integer> ls = new ArrayList<Integer>();
		String[] tmp = br.readLine().split(" ");
		for (int n = 0; n < N; n++) {
			ls.add(Integer.parseInt(tmp[n]));
		}
 */

public class Main {
	static List<Integer> money6 = new ArrayList<Integer>();
	static List<Integer> money9 = new ArrayList<Integer>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmp = br.readLine().split(" ");
		int N = Integer.parseInt(tmp[0]);



		for (int i = 6;i>=1;i--){
			money6.add((int)Math.pow(6, i));
		}
		for(int j = 5; j>=1;j--){
			money9.add((int)Math.pow(9, j));
		}
		Main m = new Main();

		int i = m.hukasa(0,N);
		System.out.println(i);

	}

	int hukasa(int c,int now){	//c...count,now...nowMoney
		if(now<9 && now >=6){
			return c + (now-6) + 1;	//countを返す
		}else if(now < 6 && now >= 0){
			return c+now;
		}else if(now<0){
			return 10000;
		}else{
			int ret6 = 0;
			int ret9 = 0;

			for(int i = 0;i<money6.size();i++){
				if(now>=money6.get(i)){
					ret6 = money6.get(i);
					break;
				}
			}
			for(int j = 0;j<money9.size();j++){
				if(now>=money9.get(j)){
					ret9 = money9.get(j);
					break;
				}
			}

			//TODO:count+1,深さ探索
			int i = hukasa(c+1,now-ret6);
			int j = hukasa(c+1,now-ret9);

			return (Math.min(i, j));



		}
	}
}
