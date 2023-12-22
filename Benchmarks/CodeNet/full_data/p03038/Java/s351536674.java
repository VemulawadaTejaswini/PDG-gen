import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//BufferedReader in = new BufferedReader(new FileReader(new File("input.txt")));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Main instance = new Main();
		String[] line = in.readLine().split(" ");
		int cards = conv(line[0]); int operates = conv(line[1]);
		line = in.readLine().split(" ");
		long[] cardArray = new long[cards];
		for(int i = 0; i < cards; i++) {
			cardArray[i] = Long.valueOf(line[i]);
		}
		Arrays.sort(cardArray);
		OpPair[] pairs = new OpPair[operates];
		for(int i = 0; i < operates; i++) {
			line = in.readLine().split(" ");
			pairs[i] = instance.new OpPair(Integer.valueOf(line[0]), Long.valueOf(line[1]));
		}
		for(OpPair pair : pairs) {
			Arrays.sort(cardArray);
			for(int i = 0; i < pair.opB; i++) {
				if(cardArray[i] < pair.opC) {
					cardArray[i] = pair.opC;
				}else {
					break;
				}
			}
		}
		long sum = 0;
		for(long l : cardArray) {
			sum += l;
		}
		System.out.println(sum);
	}
	public static int conv(String s) {
		return Integer.valueOf(s);
	}
	public class OpPair {
		public int opB;
		public long opC;
		public OpPair(int opB, long opC) {
			this.opB = opB;
			this.opC = opC;
		}
	}
}