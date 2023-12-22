import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		long[][] ball = new long[N][2];
		for(int i=0;i<N;i++) {
			ball[i][0] = sc.nextLong();
			ball[i][1] = sc.nextLong();
		}
		Map<String,Integer> pq = new HashMap<String,Integer>();
		int maxvalue = 1;
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
				String s = String.valueOf(Math.abs(ball[j][0] - ball[i][0])) + "_" + Math.abs(ball[j][1] - ball[i][1]);
				if(pq.containsKey(s)) {
					int temp = pq.get(s);
					temp++;
					if(maxvalue < temp) {
						maxvalue = temp;
					}
					pq.put(s, temp);
				}else {
					pq.put(s, 1);
				}
			}
		}
		System.out.println(N - maxvalue);
	}
}
