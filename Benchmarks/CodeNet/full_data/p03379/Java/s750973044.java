
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] get = br.readLine().split(" ");

		List<Integer> ls = new ArrayList<Integer>();

		for(int i = 0;i<get.length;i++){
			ls.add(Integer.parseInt(get[i]));
		}

		List<Integer> sorted = new ArrayList<Integer>(ls);


		sorted.sort(null);
		int left = sorted.get(ls.size()/2-1);
		int right = sorted.get((ls.size()/2));

		for(int j = 0;j<get.length;j++){
			if(ls.get(j) > left)System.out.println(left);
			else System.out.println(right);
		}






	}

}
