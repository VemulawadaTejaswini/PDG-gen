import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		Long[] vList = new Long[N];
		for(int i=0; i<N; i++){
			vList[i] = sc.nextLong();
		}
		sc.close();
		
		Arrays.sort(vList, Comparator.reverseOrder());
		
		double sum = 0;
		for(int i=0; i<A; i++){
			sum += vList[i];
		}
		double avg =  sum/(double)A;
	
		long cNum = 0;
		
		if(vList[0]==vList[A-1]){
			for(int i=A; i<=B; i++){
				int count=0;
				for(long v: vList){
					if(v==vList[A-1]) count++;
				}
				cNum += comb(count,i);
			}
		}else{
			int count=0;
			int countL=0;
			for(long v: vList){
				if(v==vList[A-1]) count++;
				if(v>vList[A-1]) countL++;
			}
			cNum = comb(count, A-countL);
		}

		
		System.out.println(avg);
		System.out.println(cNum);
	}
	
	public static final long comb(int n, int r) {
	    if (r == 1) {
	        return n;
	    }
	    long sum = 1;
	    for (int i = 1; i <= r; i++) {
	    	sum = sum * (n - i + 1) / i;
	    }
	    return sum;
	}

}