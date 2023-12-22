import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String[] line = sc.nextLine().split(" ");
    	int itemsCount = Integer.parseInt(line[0]);
    	int couponCount = Integer.parseInt(line[1]);
    	String[] priceLine = sc.nextLine().split(" ");
    	PriorityQueue<Long> priceQueue = new PriorityQueue(Collections.reverseOrder());
    	for(int i = 0;i<itemsCount;i++) {
    		Long eachNumber = Long.parseLong(priceLine[i]);
    		priceQueue.add(eachNumber);
    	}
    	for(int i = 1;i<=couponCount;i++) {
    		Long biggestNumber = priceQueue.poll();
    		if(biggestNumber != 0) {
    			biggestNumber = biggestNumber/2;
			priceQueue.add(biggestNumber);
    		}
    	}
    	Iterator<Long> iterator = priceQueue.iterator();
    	Long result = 0L;
    	while(iterator.hasNext()) {
    		result = result + iterator.next();
    	}
    	
    	System.out.println(result);
    	
    }
}