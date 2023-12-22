
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner();
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] v = sc.nextIntArray(n);
		int max = 0;

		for(int getNumber = 0; getNumber <= Math.min(n, k); getNumber++){
			for(int left = 0; left <= getNumber; left++){
				List<Integer> plusList = new ArrayList<>();
				List<Integer> minusList = new ArrayList<>();

				for(int i = 0;i < left; i++){
					int num = v[i];
					if(num >= 0)
						plusList.add(num);
					else
						minusList.add(num);
				}
				for(int i = 0; i < getNumber - left; i++){
					int num = v[n-1 - i];
					if(num >= 0)
						plusList.add(num);
					else
						minusList.add(num);
				}

				Collections.sort(minusList);

				for(int i = 0; i < k - getNumber; i++){
					if(minusList.isEmpty())
						break;
					minusList.remove(0);
				}
				int sum = plusList.stream().mapToInt(Integer::intValue).sum() + minusList.stream().mapToInt(Integer::intValue).sum();
				if(max < sum)
					max = sum;
			}
		}
		System.out.println(max);
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
