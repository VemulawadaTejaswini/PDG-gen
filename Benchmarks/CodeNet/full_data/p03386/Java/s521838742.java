import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmp = br.readLine().split(" ");
		long A = Integer.parseInt(tmp[0]);
		long B = Integer.parseInt(tmp[1]);
		long K = Integer.parseInt(tmp[2]);

		List<Long> ans = new ArrayList<Long>();

		for(long i = A;i<A+K;i++){
			if(i>B)break;
			ans.add(i);
		}
		for(long j = B;j>B-K;j--){
			if(j<A)break;
			ans.add(j);
		}

		List<Long> uniq = new ArrayList<Long>(new HashSet<>(ans));

		uniq.sort(null);

		for(int i = 0;i<uniq.size();i++){
			System.out.println(uniq.get(i));
		}
	}

}
