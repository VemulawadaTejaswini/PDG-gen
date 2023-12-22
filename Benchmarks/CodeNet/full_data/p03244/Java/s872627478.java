
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.AbstractMap.SimpleEntry;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner();
		int n = sc.nextInt();
		int[] v = sc.nextIntArray(n);
		
		Map<Integer, Integer> m1 = new HashMap<>();
		Map<Integer, Integer> m2 = new HashMap<>();
		
		for(int i = 0; i < n; i++) {
			Map<Integer, Integer> map = i % 2 == 0 ? m1 : m2;
			int count = 1;
			if(map.containsKey(v[i]))
				count += map.get(v[i]);
			map.put(v[i], count);
		}
		List<Entry<Integer, Integer>> l1 = m1.entrySet().stream()
				.sorted(Collections.reverseOrder(Comparator.comparingInt(Entry::getValue)))
				.limit(2)
				.collect(Collectors.toList());
		List<Entry<Integer, Integer>> l2 = m2.entrySet().stream()
				.sorted(Collections.reverseOrder(Comparator.comparingInt(Entry::getValue)))
				.limit(2)
				.collect(Collectors.toList());
		int result = 0;
		l1.add(new SimpleEntry<>(-1, 0));
		l2.add(new SimpleEntry<>(-1, 0));
		for(Entry<Integer, Integer> entry1 : l1) {
			for(Entry<Integer, Integer> entry2 : l2) {
				if(entry1.getKey() == entry2.getKey())
					continue;
				int sum = entry1.getValue() + entry2.getValue();
				if(result < sum)
					result = sum;
			}
		}
		System.out.println(n - result);
		
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
