import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	int l = sc.nextInt();
	    	int n = sc.nextInt();
	    	int[] x = new int[n];
	    	long count = 0L;
	    	int state = 0;
	    	int right = 0;
	    	int left = 0;
	    	boolean r = false;
	    	List<Integer> list = new ArrayList<>();
	    	for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			list.add(x[i]);
		}
	    	for (int i = 0; i < n; i++) {
	    		if (i == 0) {
	    			right = list.get(0);
	    			left = l - list.get(list.size()-1);
	    			if (right == left) {
	    				int temp = 1;
	    				while (true) {
	    					if (list.get(temp) > l - list.get(list.size()-1-temp)) {
	    						r = true;
	    						break;
	    					} else if (list.get(temp) < l - list.get(list.size()-1-temp)) {
	    						r = false;
	    						break;
	    					}
	    					temp++;
	    				}
	    			}
	    		} else {
	    			if (r) {
	    				right = list.get(0) - state;
	    				left = state + l - list.get(list.size()-1);
	    			} else {
	    				right = l - state + list.get(0);
	    				left = l - list.get(list.size()-1) - (l - state);
	    			}
	    		}
			if (right > left) {
				count += right;
				state = list.get(0);
				list.remove(0);
				r = true;
			} else if (right < left){
				count += left;
				state = list.get(list.size()-1);
				list.remove(list.size()-1);
				r = false;
			} else {
				if (r) {
					count += right;
					state = list.get(0);
					list.remove(0);
					r = true;
				} else {
					count += left;
					state = list.get(list.size()-1);
					list.remove(list.size()-1);
					r = false;
				}
			}
		}
	    	System.out.println(count);
	}
}
