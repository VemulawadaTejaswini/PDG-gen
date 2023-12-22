import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 
public class Main {
	static List<Long> a;
	static List<Long> b;
	static List<Long> c;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int k = sc.nextInt();
		a = new ArrayList<>();
		b = new ArrayList<>();
		c = new ArrayList<>();
		for(int i =0; i < x; i++)
			a.add(Long.parseLong(sc.next()));
		for(int i = 0; i < y; i++)
			b.add(Long.parseLong(sc.next()));
		for(int i = 0; i < z; i++)
			c.add(Long.parseLong(sc.next()));
		
		Collections.sort(a, Collections.reverseOrder());
		Collections.sort(b, Collections.reverseOrder());
		Collections.sort(c, Collections.reverseOrder());
		
		List<Long> ab = new ArrayList<>();
		for(int i = 0; i < x; i++)
			for(int j = 0; j < y; j++)
				ab.add(a.get(i) + b.get(j));
		Collections.sort(ab, Collections.reverseOrder());
		int size = Math.min(k, ab.size());
		List<Long> abc = new ArrayList<>();
		
		for(int i = 0; i < size; i++) 
			for(int j = 0; j < z; j++)
				abc.add(ab.get(i) + c.get(j));
		
		Collections.sort(abc, Collections.reverseOrder());

		for(int i = 0; i < k; i++)
			System.out.println(abc.get(i));
	}
}
class Scanner {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final int SPACE = (int)' ';
	private static final int LINE_END_0 = 13;
	private static final int LINE_END_1 = 10;
	
	public boolean ready() {
		try {
			return br.ready();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public String next(){
		StringBuilder sb = new StringBuilder();
		
		int length = -1;
		readLoop: while(true) {
			try {
				int value = br.read();
				switch(value) {
				case LINE_END_1:
					if(length == -1)
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
	
	public int nextInt() {
		return Integer.parseInt(next());
	}
	
	public double nextDouble() {
		return Double.parseDouble(next());
	}
	
	public long nextLong() {
		return Long.parseLong(next());
	}
}