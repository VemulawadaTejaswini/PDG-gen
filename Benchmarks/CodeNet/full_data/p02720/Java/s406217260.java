

import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Deque;

 
class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        
        Deque<Long> queue = new ArrayDeque<>();
        for(int i = 1; i < 10; i++) {
        	queue.add((long)i);
        }
        	
        long x = 0;
        for(int i = 0; i < K; i++) {
        	x = queue.poll();
        	
        	if(x % 10 != 0) {
        		queue.add(10*x + x%10 -1);
        	}
        	
        	queue.add(10*x + x%10);
        	
        	if(x % 10 != 9) {
        		queue.add(10*x + x%10 +1);
        	}
        	
        }
        
        System.out.println(x);
  
        
	}
}

 