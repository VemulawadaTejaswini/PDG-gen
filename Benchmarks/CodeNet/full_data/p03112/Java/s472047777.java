import java.util.*;


class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int Q = Integer.parseInt(sc.next());
		long[] s = new long[A];
		long[] t = new long[B];
		long[] x = new long[Q];
		for (int i=0;i<A;i++) {
			s[i]=Long.parseLong(sc.next());
		}
		for (int i=0;i<B;i++) {
			t[i]=Long.parseLong(sc.next());
		}
		for (int i=0;i<Q;i++) {
			x[i]=Long.parseLong(sc.next());
		}

		for (int i=0;i<Q;i++) {
			long dist_1 = 0L;
	    	int result = Arrays.binarySearch(s, x[i]);
	    	int index=0;
	    	if (result<0) {
	    		if (-result-2==-1) {
	    			dist_1=Math.abs(s[-result-1]-x[i]);
	    			index=-result-1;
	    		} else if (-result-1==A) {
	    			dist_1=Math.abs(s[-result-2]-x[i]);
	    			index=-result-2;
	    		} else {
	    			dist_1+=Math.min(Math.abs(s[-result-2]-x[i]),Math.abs(s[-result-1]-x[i]));
	    			if (dist_1==Math.abs(s[-result-2]-x[i])) {
	    				index=-result-2;
	    			} else {
	    				index=-result-1;
	    			}
	    		}
	    	}
	    	int result_t = Arrays.binarySearch(t, s[index]);
	    	int index_2;
	    	if (result_t<0) {
	    		if (-result_t-2==-1) {
	    			dist_1+=Math.abs(t[-result_t-1]-s[index]);
	    			index_2=-result_t-1;
	    		} else if (-result_t-1==B) {
	    			dist_1+=Math.abs(t[-result_t-2]-s[index]);
	    			index_2=-result_t-2;
	    		} else {
	    			dist_1+=Math.min(Math.abs(t[-result_t-2]-s[index]),Math.abs(t[-result_t-1]-s[index]));
	    			if (dist_1==Math.abs(t[-result_t-2]-s[index])) {
	    				index_2=-result_t-2;
	    			} else {
	    				index_2=-result_t-1;
	    			}
	    		}
	    	}

			long dist_2 = 0L;
	    	int result_3 = Arrays.binarySearch(t, x[i]);
	    	int index_3=0;
	    	if (result_3<0) {
	    		if (-result_3-2==-1) {
	    			dist_2=Math.abs(t[-result_3-1]-x[i]);
	    			index_3=-result_3-1;
	    		} else if (-result_3-1==B) {
	    			dist_2=Math.abs(t[-result_3-2]-x[i]);
	    			index_3=-result_3-2;
	    		} else {
	    			dist_2+=Math.min(Math.abs(t[-result_3-2]-x[i]),Math.abs(t[-result_3-1]-x[i]));
	    			if (dist_2==Math.abs(t[-result_3-2]-x[i])) {
	    				index_3=-result_3-2;
	    			} else {
	    				index_3=-result_3-1;
	    			}
	    		}
	    	}
	    	int result_t_2 = Arrays.binarySearch(s, t[index_3]);
	    	int index_4;
	    	if (result_t_2<0) {
	    		if (-result_t_2-2==-1) {
	    			dist_2+=Math.abs(s[-result_t_2-1]-t[index_3]);
	    			index_4=-result_t_2-1;
	    		} else if (-result_t_2-1==A) {
	    			dist_2+=Math.abs(s[-result_t_2-2]-t[index_3]);
	    			index_4=-result_t_2-2;
	    		} else {
	    			dist_2+=Math.min(Math.abs(s[-result_t_2-2]-t[index_3]),Math.abs(s[-result_t_2-1]-t[index_3]));
	    			if (dist_2==Math.abs(s[-result_t_2-2]-t[index_3])) {
	    				index_4=-result_t_2-2;
	    			} else {
	    				index_4=-result_t_2-1;
	    			}
	    		}
	    	}
	    	System.out.println(Math.min(dist_1,dist_2));
    	}
	}
}