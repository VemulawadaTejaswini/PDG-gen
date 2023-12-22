
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
 
		    Scanner scanner = new Scanner(System.in);
		    
		    int H = scanner.nextInt();
		    int N = scanner.nextInt();
		    int sum=0;
		    List<Integer> list = new ArrayList<Integer>();
		    for(int i=0;i<N;i++){
		    	list.add(i,scanner.nextInt());
		    	sum = sum + list.get(i);
		    }
		     Collections.sort(list);
		    		 
		    if(H>sum) {
			    System.out.println("No");
		    	
		    }else {
	    	 System.out.println("Yes");
		    }
		  }
}
