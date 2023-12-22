import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int x = 0; x < size; x++){
        	list.add(in.nextInt());
        }
        
        int minimum = 1;
        int counter = 0;
    	for (int x = 0; x < size; x++){
    		while (list.get(x) - minimum > 0){
    			if (list.get(x) - minimum <= list.get(x) / 2){
    				list.set(x, 1);
    			} else {
    				list.set(x, list.get(x) - minimum);
    			}
    			
    			counter++;
    		}
    		if (list.get(x) - minimum == 0) {
    			minimum++;
    		} else {
    			continue;
    		}
    	}
                
        System.out.println(counter);
        in.close();
    }
}
