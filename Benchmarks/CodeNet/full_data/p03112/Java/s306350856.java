import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int q = sc.nextInt();
		TreeSet<Long> tsS = new TreeSet<Long>();
		TreeSet<Long> tsT = new TreeSet<Long>();
		/*
		tsS.add(Long.MAX_VALUE);
		tsS.add(Long.MAX_VALUE - 1);
		tsS.add(Long.MIN_VALUE);
		tsS.add(Long.MIN_VALUE + 1);
		tsT.add(Long.MAX_VALUE);
		tsT.add(Long.MAX_VALUE - 1);
		tsT.add(Long.MIN_VALUE);
		tsT.add(Long.MIN_VALUE + 1);
		*/
		long[] x = new long[q];
		for(int i = 0; i < a; i++){
		    tsS.add(sc.nextLong());
		}
		for(int i = 0; i < b; i++){
		    tsT.add(sc.nextLong());
		}
		for(int i = 0; i < q; i++){
		    x[i] = sc.nextLong();
		}
		// 計算
		long[] result = new long[q];
		for(int i = 0; i < q; i++){
		    long here = x[i];
		    Long rS = tsS.higher(here);
		    Long lS = tsS.lower(here);
		    Long rT = tsT.higher(here);
		    Long lT = tsT.lower(here);
		    Long rSrT = (rS == null ? null : tsT.higher(rS));
		    Long rSlT = (rS == null ? null : tsT.lower(rS));
		    Long lSrT = (lS == null ? null : tsT.higher(lS));
		    Long lSlT = (lS == null ? null : tsT.lower(lS));
		    Long rTrS = (rT == null ? null : tsS.higher(rT));
		    Long rTlS = (rT == null ? null : tsS.lower(rT));
		    Long lTrS = (lT == null ? null : tsS.higher(lT));
		    Long lTlS = (lT == null ? null : tsS.lower(lT));
		    result[i] =
		        min(dist(here, rS, rSrT),
		        min(dist(here, rS, rSlT),
		        min(dist(here, lS, lSrT),
		        min(dist(here, lS, lSlT),
		        min(dist(here, rT, rTrS),
		        min(dist(here, rT, rTlS),
		        min(dist(here, lT, lTrS),
		        dist(here, lT, lTlS))))))));
		}

		// 出力
		for(int i = 0; i < q; i++){
		    System.out.println(result[i]);
		}
        
	}
	static long dist(long here, Long first, Long second){
	    if(first == null || second == null) return Long.MAX_VALUE;
	    return abs(first - here) + abs(second - first);
	}
}
