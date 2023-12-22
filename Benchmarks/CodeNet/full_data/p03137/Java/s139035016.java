

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int M = sc.nextInt();
	    
	    int X [] = new int [M];

	    for (int i=0;i<M;i++) {
	    	X[i]=sc.nextInt();
	    }
	    sc.close(); 
	    Arrays.sort(X);
	    
	    Deque <Integer> D = new ArrayDeque<Integer>(); 

	    for (int i=0;i<M-1;i++) {
	    	D.push(X[i+1]-X[i]);
	    	//System.out.println(D.peek());
	    }
	    int size = Math.min(N-1, D.size());
	    for (int i=0;i<size;i++) {
	    	D.remove(Collections.max(D));
	    }
	    
	    int new_size = D.size();
	    int sum = 0;
	    
	    for (int i=0;i<new_size;i++) {
	    	sum+=D.poll();
	    }
	    System.out.println(sum);
	}
}


