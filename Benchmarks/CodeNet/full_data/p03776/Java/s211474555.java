import java.util.ArrayList;
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
		
		double avg = 0;
		ArrayList<Integer> targetList = new ArrayList<Integer>();
		for(double num = A; num <=B; num++){
			double sum = 0;
			for(int i=0; i<num; i++){
				sum += vList[i];
			}
			double tmpAvg = sum/num;
			if(tmpAvg==avg){
				targetList.add((int)num);		
			}else if(tmpAvg>avg){
				targetList = new ArrayList<Integer>();
				targetList.add((int)num);
				avg = tmpAvg;
			}
		}
	
		long cNum = 0;
		for(int num: targetList){
			int count=0;
			int countL=0;
			for(long v: vList){
				if(v==vList[num-1]) count++;
				if(v>vList[num-1]) countL++;
				if(v<vList[num-1]) break;
			}
			cNum += combination(count,(num-countL));
		}
		
		System.out.println(avg);
		System.out.println(cNum);

	}
	
	public static final long combination(int n, int r) {
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