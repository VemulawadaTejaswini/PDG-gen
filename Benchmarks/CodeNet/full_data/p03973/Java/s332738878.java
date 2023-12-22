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
        
        int minimum = 2;
        int counter = list.get(0) - 1;
    	for (int x = 1; x < size; x++){
    		int num = list.get(x);
			
			if (num % minimum == 0){
				counter += (num / minimum) - 1;			
				list.set(x, minimum);
			} else {
				counter += (num / minimum);
				list.set(x, list.get(x) % minimum);
			}
		
    		
    		if (list.get(x) - minimum == 0 && num == minimum) {    			
    			minimum++;
    		}
    			
    	}
                
        System.out.println(counter);
        in.close();
    }
}
