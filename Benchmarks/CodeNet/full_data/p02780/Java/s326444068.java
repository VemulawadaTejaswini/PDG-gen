import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line[] = br.readLine().split(" ");
		int n = Integer.parseInt(line[0]);
		int k = Integer.parseInt(line[1]);
		line = br.readLine().split(" ");
		br.close();
		
		List<Integer> nums = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			nums.add(Integer.parseInt(line[i]));
		}

		List<Double> result = new ArrayList<Double>();
//		for(int i=0;i<n-k+1;i++) {
//			double res = 0.000000f;
//			for(int l=i;l<i+k;l++){
//				double s = (1.000000f + nums.get(l))/2;
//				res = res + s;
//			}
//			result.add(res);
//		}
		List<Double> sum = new ArrayList<Double>();
		
		sum.add((1.000000 + nums.get(0))/2);
		for(int i=1;i<n;i++) {
			double e = (1.000000 + nums.get(i))/2;
			double pre = sum.get(i-1);
			sum.add(pre+e);
		}
		for(int i=1;i<n-k;i++) {
			result.add(sum.get(i+k)-sum.get(i));
		}		
		System.out.println(Collections.max(result));
	}

}
