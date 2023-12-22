
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	static long[] length;
	static long[] pArray;

	public static void main(String[] args) {
		Scanner sc = new Scanner();
		int n = sc.nextInt();
		long x = sc.nextLong();
		length = new long[n+1];
		pArray = new long[n+1];

		for(int i = 0; i < n; i++){
			if(i == 0) {
				length[i] = 1;
				pArray[i] = 1;
			}else {
				length[i] = length[i - 1] + (long) Math.pow(2, i+1);
				pArray[i] = pArray[i-1] + (long)Math.pow(2, i);
			}
		}


		System.out.println(calc(n, x));
	}

	static Map<Integer, Long> map = new HashMap<>();


	static long calc(int n, long x){
		if(n == 0)
			return 1;

		if(n == x && map.containsKey(n))
			return map.get(n);

		long sum = 0;
		x--;
		long beforeLength = length[n-1];
		if(x > 0) {
			if(beforeLength <= x){
				sum += pArray[n-1];
			}else{
				sum += calc(n - 1, Math.min(x, beforeLength));
			}
			x -= beforeLength;
		}
		if(x > 0){
			x--;
			sum += 1;
		}
		if(x > 0){
			if(beforeLength <= x){
				sum += pArray[n-1];
			}else{
				sum += calc(n - 1, Math.min(x, beforeLength));
			}
			x -= beforeLength;
		}
		if(n == x){
			map.put(n, sum);
		}

		return sum;
	}
}

class Scanner {
	private static final int SPACE = (int)' ';
	private static final int LINE_END_0 = 13;
	private static final int LINE_END_1 = 10;
	private static final int BEFORE = -1;
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public String next(){
		StringBuilder sb = new StringBuilder();
		
		int length = BEFORE;
		readLoop: while(true) {
			try {
				int value = br.read();
				switch(value) {
				case LINE_END_1:
					if(length == BEFORE)
						break;
					
					if((int)sb.charAt(length) == LINE_END_0)
						sb.deleteCharAt(length);
				case SPACE:
					break readLoop;
				}
				sb.append((char)value);
				length++;

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return sb.toString();
	}
	
	public String[] nextArray(int length) {
		String[] array = new String[length];
		for(int i = 0; i < length; i++)
			array[i] = next();
		return array;
	}
	
	public double nextDouble() {
		return Double.parseDouble(next());
	}
	
	public double[] nextDoubleArray(int length) {
		double[] array = new double[length];
		for(int i = 0; i < length; i++)
			array[i] = nextDouble();
		return array;
	}
	
	public int nextInt() {
		return Integer.parseInt(next());
	}
	
	public int[] nextIntArray(int length) {
		int[] array = new int[length];
		for(int i = 0; i < length; i++)
			array[i] = nextInt();
		return array;
	}
	
	public long nextLong() {
		return Long.parseLong(next());
	}
	
	public long[] nextLongArray(int length) {
		long[] array = new long[length];
		for(int i = 0; i < length; i++)
			array[i] = nextLong();
		return array;
	}
	
	public boolean ready() {
		try {
			return br.ready();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
