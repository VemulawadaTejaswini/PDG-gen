import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	static int n;
	static int[] num;
	
	public static void main(String[] args) throws Exception {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			n = Integer.parseInt(br.readLine());
			num = new int[n+1];
			for(int i=2; i<=n; i++) {
				int c = i;
				for(int j=2; j<=i; j++) {
					while(c % j == 0) {
						num[j]++;
						c /= j;
					}
				}
			}
			Arrays.stream(num).mapToObj(Integer::toString).map(e -> e + ", ").forEach(System.out::print);
			System.out.println();
			
			int result = (count(75) + count(25) * (count(3) - 1) + count(15) * (count(5) - 1)
					+ count(5) * (count(5) - 1) * (count(3) - 2) / 2);
			System.out.println(result);
		}
	}
	
	public static int count(int nn) {
		return Arrays.stream(num).filter(e -> e >= nn - 1).toArray().length;
	}

}