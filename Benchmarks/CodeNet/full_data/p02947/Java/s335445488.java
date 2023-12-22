import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main { 

	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int numberCount = Integer.parseInt(sc.nextLine());
    	
    	Map<String,Long> map = new HashMap<>();
    	long result = 0;
    	for(int i = 1;i<=numberCount;i++) {
    		String eachLine = sc.nextLine();
    		char[] charLine = eachLine.toCharArray();
    		Arrays.sort(charLine);
    		String sortedLine = new String(charLine);
    		
    		if(map.containsKey(sortedLine)) {
    			long tmp = map.get(sortedLine)+1;
    			result = result + tmp;
    			map.put(sortedLine, tmp);
    		}else {
    			map.put(sortedLine, 0l);
    		}
    		
    		
    	}
    	System.out.println(result);
    	
	}
}