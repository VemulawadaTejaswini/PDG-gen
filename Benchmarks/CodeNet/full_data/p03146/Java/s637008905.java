import java.util.*;
public class Main {
	public static void main(String[] args){
      	Scanner sc = new Scanner(System.in);
      	int a1 = sc.nextInt();
        int prev = 0;
        Set<Integer> used = new HashSet<>();
      	for (int i = 1; ; i++) {
          	if (i == 1) {
            	used.add(a1);
              	prev = a1;
            } else {
            	int val = helper(prev);
              	if (used.contains(val)) {
                	System.out.println(i);
                  	break;
                } else {
                	used.add(val);
                  	prev = val;
                }
            }
        }
	}
  
    private static int helper(int n) {
    	if (n % 2 == 0) {
        	return n / 2;
        } else {
        	return 3 * n + 1;
        }
    }
}