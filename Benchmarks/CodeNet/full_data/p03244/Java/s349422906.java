import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;
import java.util.Map.Entry;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		FastScanner sc = new FastScanner(System.in);
		
		TypeNumCounter odd = new TypeNumCounter();
		TypeNumCounter even = new TypeNumCounter();
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++){
			if(i % 2 == 0) even.add(sc.nextInt());
			else odd.add(sc.nextInt());
		}
		
		List<Entry<Integer, Integer>> listOdd = odd.entryList();
		List<Entry<Integer, Integer>> listEven = even.entryList();
		
		int o1 = listOdd.get(0).getKey();
		int o1num = listOdd.get(0).getValue();
		int o2num = (listOdd.size() >= 2) ? listOdd.get(1).getValue() : 0;
		int e1 = listEven.get(0).getKey();
		int e1num = listEven.get(0).getValue();
		int e2num = (listEven.size() >= 2) ? listEven.get(1).getValue() : 0;
		
		int ans = 0;
		if(o1 != e1){
			ans = n - o1num - e1num;
		}else{
			ans = Math.min(n - o1num - e2num, n - o2num - e1num);
		}
		System.out.println(ans);
	}
}

class TypeNumCounter{
	
	HashMap<Integer, Integer> map;
	List<Entry<Integer, Integer>> listEntries;
	
	public TypeNumCounter(){
		map = new HashMap<Integer, Integer>();
	}
	
	public void add(int a){
		Integer count = map.get(a);
		if(count == null) map.put(a, 1);
		else map.put(a, count+1);
	}
	
	public void add(int a, int count){
		Integer c = map.get(a);
		if(c == null) map.put(a, count);
		else map.put(a, c+count);
	}
	
	public int get(int a){
		Integer count = map.get(a);
		if(count == null) return 0;
		else return count.intValue();
	}
	
	public List<Entry<Integer, Integer>> entryList(){
		listEntries = new ArrayList<Entry<Integer, Integer>>(map.entrySet());
        //降順
        Collections.sort(listEntries, new Comparator<Entry<Integer, Integer>>() {
            public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });
        //for(Entry e : listEntries) System.out.println(e.getKey() + " " + e.getValue());
        
        return listEntries;
	}
}

class FastScanner {
    private InputStream in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    public FastScanner(InputStream in) {
		this.in = in;
	}
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }
    private int readByte() {
    	if (hasNextByte()) return buffer[ptr++];
    	else return -1;
    }
    private static boolean isPrintableChar(int c){
    	return 33 <= c && c <= 126;
    }
    public boolean hasNext() {
    	while(hasNextByte() && !isPrintableChar(buffer[ptr]))
    		ptr++; return hasNextByte();
    }
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() {
    	return Double.parseDouble(next());
    }
}