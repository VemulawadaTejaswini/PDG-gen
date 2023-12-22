import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Main {
	static int PN = 1000000;
	static List<Integer> prime = new ArrayList<Integer>();
	static Map<Integer,Boolean> primeMap = new HashMap<Integer,Boolean>();
	static int[] arr = new int[10];
	static Map<String,Integer> numberMap = new HashMap<String,  Integer>();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		init();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		String[] wrods = br.readLine().split(" ");
		arr = new int[wrods.length];
		for(int i=1;i<=N;i++) {
			arr[i-1] = Integer.parseInt(wrods[i-1]);
			Map<Integer,Integer> tmpMap = compute(map,arr[i-1]);
		}
		BigInteger t = BigInteger.ONE;
		for(Entry<Integer,Integer> entry:map.entrySet()) {
			int a = entry.getKey();
			int p = entry.getValue();
			t = t.multiply(BigInteger.valueOf(numberMap.get(a+"_"+p)));
		}
		BigInteger res = BigInteger.ZERO;
		for(int i=1;i<=N;i++) {
			BigInteger once = t.add(BigInteger.ZERO).divide(BigInteger.valueOf(arr[i-1]));
			res = res.add(once).mod(BigInteger.valueOf(1000000007));
		}
		System.out.println(res);
	}
	
	private static Map<Integer,Integer> compute(HashMap<Integer, Integer> map,int A) {
		Map<Integer,Integer> tmpMap = new HashMap<Integer, Integer>();
		for(int i=0,size=prime.size();i<size;) {
			
			if( primeMap.get(A) != null) {

				Integer count = tmpMap.get(A) ;
				
				if( count ==  null) {
					tmpMap.put(A, 1);
				}else {
					tmpMap.put(A,count+1);
				}
				
				break;
			}
			
			else if( A % prime.get(i) == 0) {
				int p =  prime.get(i);
				
				Integer count = tmpMap.get(p) ;
				
				if( count ==  null) {
					tmpMap.put(p, 1);
				}else {
					tmpMap.put(p,count+1);
				}
				
				A = A / p;
			}else {
				i++;
			}
		}
		for(Entry<Integer, Integer> entry:tmpMap.entrySet()) {
			int p = entry.getKey();
			int count = entry.getValue();
			
			Integer currCount = map.get(p);
			
			if( currCount == null || currCount <= count) {
				map.put(p,count);
			}
		}
		return tmpMap;
	}
	
	
	
	private static boolean isPrime(int n) {
		int t = (int)Math.sqrt(n);
		for(int i=2;i<=t;i++) {
			if( n% i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void init() {
		primeMap.put(1,true);
		for(int i=2;i<=PN;i++) {
			if( isPrime(i)) {
				prime.add(i);
				primeMap.put(i, true);
			}
		}
		numberMap.put("1_0",1);
		numberMap.put("1_1",1);
		for(Integer p:prime) {
			for(int exp=0,v=1;v<=PN;exp++,v=v*p) {
				numberMap.put(p+"_"+exp, v);
			}
		}
//		System.out.println(prime.size()+";largest:"+prime.get(prime.size()-1));
	}
}
