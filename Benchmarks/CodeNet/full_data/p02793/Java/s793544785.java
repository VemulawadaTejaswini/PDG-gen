import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class AtCodeE {
	static int[] arr ;
	static int N;
	static int commonGcd;
	static List<HashMap<Integer,Integer>> pplist = new ArrayList<HashMap<Integer,Integer>>();	
	static int PN = 1000000;
	static List<Integer> prime = new ArrayList<Integer>();
	static Map<Integer,Boolean> primeMap = new HashMap<Integer,Boolean>();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		init();
		read();
		ppList();
	}
	
	private static void ppList() {
		HashMap<Integer, Integer> maxMap = new HashMap<Integer, Integer>();
		for(int i=0;i<N;i++) {
			int A = arr[i] / commonGcd;
			compute(maxMap,A);
		}
		
		long sum = 0;
		for(int i=0;i<N;i++) {
			HashMap<Integer, Integer> map = pplist.get(i);
			long t = 1;
			for(Integer p:maxMap.keySet()) {
				int count = maxMap.get(p);
				int count2 = (map.get(p) == null?0:map.get(p));
				
				t = t * pow(p,count-count2)%1000000007;
			}
			sum = (sum + t) %1000000007;
		}
		System.out.println(sum);
	}
	
	private static long pow(int a,int p) {
		if(p == 1) {
			return a;
		}
		if( p == 0) {
			return 1;
		}
		int res = 1;
		int p2 = a * a;
		for(int t=2;t<=p;t+=2) {
			res = res *  p2;
		}
		res = res * (p%2==1?a:1);
		return res;
	}
	
	private static void compute(HashMap<Integer, Integer> maxMap,int A) {
		HashMap<Integer,Integer> tmpMap = new HashMap<Integer, Integer>();
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
			
			Integer currCount = maxMap.get(p);
			
			if( currCount == null || currCount <= count) {
				maxMap.put(p,count);
			}
		}
		pplist.add(tmpMap);
		
	}
	
	private static int gcd(int a,int b) {
		if( b % a  == 0) {
			return a;
		}else {
			return gcd(b%a,a);
		}
	}
	
	private static void read() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		String[] wrods = br.readLine().split(" ");
		arr = new int[wrods.length];
		for(int i=1;i<=N;i++) {
			arr[i-1] = Integer.parseInt(wrods[i-1]);
			if( i > 1) {
				commonGcd = gcd( commonGcd,arr[i-1]);
			}else {
				commonGcd = arr[0];
			}
		}
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
	
	private static void init() {
		primeMap.put(1,true);
		for(int i=2;i<=PN;i++) {
			if( isPrime(i)) {
				prime.add(i);
				primeMap.put(i, true);
			}
		}
		
	}
}
