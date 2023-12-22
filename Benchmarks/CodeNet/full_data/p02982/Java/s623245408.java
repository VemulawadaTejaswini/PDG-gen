import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		String[] D = W.split(" ");

		int n = Integer.parseInt(D[0]);
		int d = Integer.parseInt(D[1]);

		ArrayList<ArrayList<Integer>> x = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<n;i++){
			W = in.readLine();
			ArrayList<Integer> tmp = new ArrayList<Integer>();
			D = W.split(" ");
			for(int k=0;k<D.length;k++){
				tmp.add(Integer.parseInt(D[k]));
			}
			x.add(tmp);
		}

		int ans =0;
		for(int i=0;i<x.size();i++){
			for(int k=i+1;k<x.size();k++){
				if(calc(x.get(i),x.get(k))){
					ans++;
				}

			}
		}

		System.out.println(ans);
	}

	public static boolean calc(ArrayList<Integer> y , ArrayList<Integer> z ){
		long ans = 0;
		for(int i=0;i<y.size();i++){
			ans += Math.pow((y.get(i)-z.get(i)), 2);
		}
		double sqrt = Math.sqrt(ans);
		long c = (long)sqrt;
		return ans == Math.pow(c,2);
	}

}
