
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    long K=gl();
	    long[] A=new long[N];
	    long[] B=new long[N];
	    Map<Long, Long> map=new TreeMap<Long, Long>();

	    for(int i=0; i<N;i++) {
	    	A[i]=gl();
	    	B[i]=gl();
	    	if (map.containsKey(A[i])) {
	    		long v=map.get(A[i])+B[i];
	    		map.put(A[i], v);
	    	}else {
	    		map.put(A[i], B[i]);
	    	}
	    }

	    long m=0;
	    long r=0;
	    for(Long k: map.keySet()) {
	    	long v=map.get(k);
	    	m+=v;
	    	r=k;
	    	if(K<=m) {
	    		break;
	    	}

	    }
        System.out.print(r);

//        if (m%2==0) {
//        	System.out.println(m/2);
//        }else{
//        	System.out.println((m+1)/2);
//        }
	}

	// 文字列として入力を取得
	public static String gs() {
		return scanner.next();
	}

	// intとして入力を取得
	public static int gi() {
		return Integer.parseInt(scanner.next());
	}

	// longとして入力を取得
	public static long gl() {
		return Long.parseLong(scanner.next());
	}

	// doubleとして入力を取得
	public static double gd() {
		return Double.parseDouble(scanner.next());
	}
}