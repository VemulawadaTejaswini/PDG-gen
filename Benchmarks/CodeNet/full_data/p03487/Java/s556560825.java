

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    
	    Queue <Long> OVER = new LinkedList<Long>(); 
	    PriorityQueue <Long> A = new PriorityQueue<Long>(); 
	    
        for(int i = 0; i < N; i++) {
        	Long temp = sc.nextLong();
        	if (temp<=Math.pow(10, 5))
        		A.add(temp);
        	else
        		OVER.add(temp);
        }
        sc.close();
        
        if (A.isEmpty())
        	System.out.println(OVER.size());
	    
        else {
        int size = A.size();
        long count = 0;
        int ans = 0;
        
        while (A.isEmpty()!=true){
        	count = 1;
        	long temp = A.poll();
        	
        	while (A.isEmpty()!=true && A.peek()==temp){
        		A.poll();
        		count++;
        	}
        	
        	if (temp>count)
        		ans += count; 
        	
        	else if (temp<count)
        		ans += (count-temp);
        	
        }
        System.out.println(OVER.size()+ans);
        
        }

	}

}
