import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();

		int[] p = new int[N+1];
		for(int i=1;i<=N;i++) {
			int cnt = 0;
			int pdt = i;
			while(pdt<K) {
				pdt *= 2;
				cnt++;
			}
			p[i] = cnt;
		}
		long sum = 0;
		int max = p[1];
		for(int i=1;i<=N;i++) {
			sum += Math.pow(2, max-p[i]);
		}
		BigDecimal SUM = BigDecimal.valueOf(sum);
		BigDecimal P = BigDecimal.valueOf(Math.pow(2, max)*N);
		BigDecimal ans = SUM.divide(P,10,RoundingMode.HALF_UP);
		System.out.println(ans);
	}
}