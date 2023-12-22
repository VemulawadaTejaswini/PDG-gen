import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmp = br.readLine().split(" ");
		int N = Integer.parseInt(tmp[0]);
		int M = Integer.parseInt(tmp[1]);

		ArrayList<Long> A = new ArrayList<Long>();
		tmp = br.readLine().split(" ");
		for(int i = 0;i<N;i++){
			A.add(Long.parseLong(tmp[i]));
		}

		ArrayList<Long> C = new ArrayList<Long>();

		for(int i = 0;i<M;i++){
			tmp = br.readLine().split(" ");
			int b = Integer.parseInt(tmp[0]);
			int c = Integer.parseInt(tmp[1]);

			if(C.size()<=N){
				for(int j = 0;j<b;j++)C.add((long)c);
			}
		}

		A.sort(null);
		C.sort(Collections.reverseOrder());

		long sum = 0;
		int reg = 0;
		for(int i = 0;i<C.size();i++){
			for(int p = reg;p<Math.min(A.size(), C.size());p++){
				if(A.get(p) >= C.get(p)){

				}else{
					A.set(p, C.get(p));
					reg = p+1;
					break;
				}

			}

		}

		for(int i = 0;i<A.size();i++){
			sum += A.get(i);
		}

		System.out.println(sum);





	}
}
