import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    try {
            int numberOfSides = Integer.parseInt(br.readLine());
            List<Integer> sides = new ArrayList<Integer>();
            if (3 <= numberOfSides && numberOfSides <= 10) {
            	List<String> sidesStr = Arrays.asList(br.readLine().split(" ")).stream().collect(Collectors.toList());
            	try {
            		for(int i = 0; i<numberOfSides; i++) {
            		    sides.add(Integer.parseInt(sidesStr.get(i)));
            		}
            	} catch (NumberFormatException e) {
        			System.exit(1);
        		}
            	if(sides.size() == numberOfSides && 1 <= sides.iterator().next() && sides.iterator().next() <= 100) {
            	    Collections.sort(sides, Comparator.reverseOrder());
            	    int max = sides.stream().findFirst().get();
            	    int sum = sides.stream().mapToInt(v -> v).filter(v -> v != max).sum();
            	    if(max < sum) {
            	    	System.out.println("Yes");
            	    } else {
            	    	System.out.println("No");
            	    }
            	} else {
                	System.exit(1);
            	}
            } else {
            	System.exit(1);
        	}
		} catch (Exception e) {
			System.exit(1);
		}
	}
}
