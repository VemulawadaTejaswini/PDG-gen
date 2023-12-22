import java.util.*;
public class Main {
	    public static void main(String[]args){
	        Scanner scan = new Scanner (System.in);
	        int n = scan.nextInt();
	        int m = scan.nextInt();
	        int[] a = new int[m];
	        long[] map = new long [n+1];
	        for(int i = 0; i < m;i++) {
	        	a[i] = scan.nextInt();
	        }
	        Long ans = downSteps(n,m,a,map);
	        System.out.println(ans%1000000007);
	}
	    public static long downSteps (int Step,int m,int[]a,long[] map) {
	    	if(map[Step] > 0) {
	    		return map[Step];
	    	}
	    	boolean nextStepExistence = true;
	    	boolean twoDownStepExistence = true;
	    	int nextStep = Step-1;
	    	int twoDownStep = Step-2;
	    	long pattern = 1;
	    	for(int i = 0; i < m;i++) {
	    		if(nextStep < 0||a[i] == nextStep || !nextStepExistence) {
	    			nextStepExistence = false;
	    		}
	    		if(twoDownStep < 0 || a[i] == twoDownStep || !twoDownStepExistence) {
	    			twoDownStepExistence = false;
	    		}
	    	}
	    	if(nextStepExistence) {
	    		pattern = downSteps(nextStep,m,a,map);
	    	}
	    	if(twoDownStepExistence) {
	    		if(nextStepExistence) {
	    			pattern += downSteps(twoDownStep,m,a,map);
	    		}else {
	    			pattern = downSteps(twoDownStep,m,a,map);
	    		}
	    	}
	    	if(!twoDownStepExistence&&!nextStepExistence&&Step != 0) {
	    		pattern = 0;
	    	}
	    	map[Step] = pattern;
	    	return pattern;
	    }
}
