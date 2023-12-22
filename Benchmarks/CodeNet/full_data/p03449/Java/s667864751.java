import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		List<Integer> A1 = new ArrayList<Integer>();
		List<Integer> A2 = new ArrayList<Integer>();

		String[] inp = br.readLine().split(" ");
		String[] inp2 = br.readLine().split(" ");

		int sum = 0,sum1 = 0;
		for (int i = 0;i<inp.length;i++){
			sum += Integer.parseInt(inp[i]);
			sum1 += Integer.parseInt(inp2[i]);
			A1.add(sum);
			A2.add(sum1);
		}

		int maxCandy = A1.get(0) + A2.get(N-1);

		for(int i = 1;i<N;i++){
			int now = A1.get(i) + (A2.get(N-1) - A2.get(i-1));
			maxCandy = Math.max(now, maxCandy);
		}

		System.out.println(maxCandy);


	}
}