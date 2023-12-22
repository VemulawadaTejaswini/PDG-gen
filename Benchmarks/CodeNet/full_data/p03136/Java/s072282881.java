import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) {
	    try {
            int numberOfSides = Integer.parseInt(br.readLine().trim());
            if (3 <= numberOfSides && numberOfSides <= 10) {
            	List<String> sidesStr = Arrays.asList(br.readLine().split(" ")).stream().collect(Collectors.toList());
            	List<Integer> sides = sidesStr.stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());
            	if(sides.size() == numberOfSides && 1 <= sides.iterator().next() && sides.iterator().next() <= 100) {
            	    Collections.sort(sides, Comparator.reverseOrder());
            	    int max = sides.stream().findFirst().get();
            	    int sum = sides.stream().mapToInt(v -> v).filter(v -> v != max).sum();
            	    if(max < sum) {
            	    	System.out.println("Yes");
            	    } else { System.out.println("No"); }
            	}
            }
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
