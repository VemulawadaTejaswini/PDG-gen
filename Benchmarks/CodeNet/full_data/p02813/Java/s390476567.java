import java.util.*;

public class Main {

	static Map<Integer, Long> factMap = new HashMap<>();
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for(int i = 0; i < n; i++)
        	p[i] = sc.nextInt();
        int[] q = new int[n];
        for(int i = 0; i < n; i++)
        	q[i] = sc.nextInt();

        int[] cntP = new int[n];
        for(int i = 0; i < n; i++) {
        	int cnt = 0;
        	for(int j = 0; j < i; j++) {
        		if(p[j] < p[i])
        			cnt++;
        	}
        	cntP[i] = cnt;
        }

        int[] cntQ = new int[n];
        for(int i = 0; i < n; i++) {
        	int cnt = 0;
        	for(int j = 0; j < i; j++) {
        		if(q[j] < q[i])
        			cnt++;
        	}
        	cntQ[i] = cnt;
        }

        long numP = calPosition(p, cntP);
        long numQ = calPosition(q, cntQ);
        System.out.println(Math.abs(numP - numQ));
    }

    private static long calPosition(int[] p, int[] cntP) {
    	long res = 0;
    	int n = p.length;
    	for(int i = 0; i < n; i++) {
    		int rightCnt = n - i - 1;
    		int smallCnt = p[i] - 1 - cntP[i];
    		res += smallCnt * factorial(rightCnt);
    	}
    	return res;
    }

    private static long factorial(int n) {
    	if(factMap.containsKey(n))
    		return factMap.get(n);
    	if(n == 1) 
    		return 1;
    	if(n == 0)
    	    return 0;
    	long res = n * factorial(n-1);
    	factMap.put(n, res);
    	return res;
    }
}
