

import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;

 
class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        
        Queue<Long> queue = new ArrayDeque<>();
        for(int i = 1; i < 10; i++) {
        	queue.add((long)i);
        }
        	
        long x = 0;
        for(int i = 0; i < K; i++) {
        	x = queue.poll();
        	if(x % 10l != 0l) {
        		queue.add(10l*x + x%10l -1l);
        	}
        	
        	queue.add(10l*x + x%10l);
        	
        	if(x % 10l != 0l) {
        		queue.add(10l*x + x%10 +1l);
        	}
        	
        }
        
        System.out.println(x);
  
        
	}
}

 