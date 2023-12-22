import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	List<Integer> list = new LinkedList<>();
    	int max = 0;
    	int order = 0;
    	for (int i = 0; i < N; i++) {
    		int num = sc.nextInt();
    		if (max < num) {
    			max = num;
    			order = i;
    		}
    		list.add(num);
    	}
    	for (int i = 0; i < list.size(); i++) {
    		if (i != order) {
    			System.out.println(max);
    		} else {
    			int subMax = 0;
    			for (int j = 0; j < N; j++) {
    				if (j != order && subMax < list.get(j)) {
    					subMax = list.get(j);
    				}
    			}
    			System.out.println(subMax);
    		}
    	}
    }
}