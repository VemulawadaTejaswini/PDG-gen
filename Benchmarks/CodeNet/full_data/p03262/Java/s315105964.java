import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.next());
        int first = Integer.parseInt(in.next());
        List<Integer> pos = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            pos.add(Integer.parseInt(in.next()) - first);
        }
        in.close();
        Collections.sort(pos);
        
        List<Integer> diff = new ArrayList<>();
        for (int i = 0; i < num-1; i++) {
            diff.add(pos.get(i + 1) - pos.get(i));
        }
        Collections.sort(diff);
        
        int min = diff.get(0);
        int divisor = 2;
        boolean isFound = false;
        table:
        while (!isFound) {
        	for(int i = 0; i < num; i++) {
        		if ( pos.get(i) % min != 0 ) {
        			break;
        		}
              	if (i == num - 1) break table;
        	}
        	if (min % divisor == 0) {
        		min /= divisor;
        	} else {
        		boolean bool = true;
        		while (bool) {
	        		if (divisor == 2) {
	        			divisor++;
	        		} else {
	        			divisor += 2;
	        		}
	        		if (min % divisor == 0) {
	        			min /= divisor;
	        			bool = false;
	        		}
        		}
        	}
        }
        System.out.println(min);
    }
}