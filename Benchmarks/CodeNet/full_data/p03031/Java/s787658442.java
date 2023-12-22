
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner();
		int n = sc.nextInt();
		int m = sc.nextInt();
		List<List<Integer>> table = new ArrayList<>();
		for(int i = 0; i < m; i++){
			int k = sc.nextInt();
			List<Integer> l = new ArrayList<>(k);
			for(int j = 0;j < k; j++)
				l.add(sc.nextInt());
			table.add(l);
		}
		int[] p = sc.nextIntArray(m);

		int count = 0;

		for(int i = 0; i < Math.pow(2,n); i++){
//			System.out.println("i=" +i);
			String s = Integer.toBinaryString(i);
			int zero = n - s.length();
			for(int z =0;z < zero; z++)
				s = "0" + s;
			boolean isOk = true;
			for(int j = 0;j < m; j++){
				List<Integer> l = table.get(j);
				int pj = p[j];
				final String str = s;
				int sum = (int)l.stream().filter(num -> str.charAt(num-1) == '1').count();
//				System.out.println("l="+l);
//				System.out.println("pj="+pj);
//				System.out.println("sum="+sum);
//				System.out.println("s="+s);
				isOk &= sum % 2 == pj;
			}
			if(isOk)
				count++;
		}
		System.out.println(count);

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
