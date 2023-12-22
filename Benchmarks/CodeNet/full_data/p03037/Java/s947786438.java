import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmp = br.readLine().split(" ");
		int N = Integer.parseInt(tmp[0]);
		int M = Integer.parseInt(tmp[1]);

		List<Integer> L = new ArrayList<Integer>();
		List<Integer> R = new ArrayList<Integer>();

		for(int i = 0;i<M;i++){
			tmp = br.readLine().split(" ");
			L.add(Integer.parseInt(tmp[0]));
			R.add(Integer.parseInt(tmp[1]));
		}

		//1つ目の範囲を代入

		List<Integer> range = new ArrayList<Integer>();
		List<Integer> n_range = new ArrayList<Integer>();

		for(int i = L.get(0); i<=R.get(0);i++){
			range.add(i);
		}

		//2つ目以降は取り除いていく

		for(int i = 1;i<M;i++){
			for(int j = L.get(i);j<=R.get(i);j++){
				if(range.contains(j))n_range.add(j);
			}
			range = new ArrayList<Integer>(n_range);
			n_range.clear();
		}

		System.out.println(range.size());


	}
}
