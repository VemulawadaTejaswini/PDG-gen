import java.util.*;

public class Main {

	static void log(String s) {
		System.out.println(s);
	}

	static void log(int i) {
		System.out.println(i);
	}
	
	static void log(long i) {
		System.out.println(i);
	}
	
	// test 4  D
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();		// num of points
		
		Queue queue;
//		= new Queue();
		try {
			queue = new Queue();
					
//					Main.Queue.class.newInstance();
		}
		catch(Exception e) {
			log( e.toString() );
			return;
		}
		
		
		// initialize until 10
		for (int i=1; i<=9; i++) {
			queue.put(i);
		}
		
		long val=1;
		
		// queue から read しつつ、couunt
		for (int from=1; from<=k; from++) {
			val = queue.get();
			long nextVal;
			
			if (val % 10 != 0) {
				nextVal = 10 * val + (val % 10) - 1;
				queue.put(nextVal);
			}
			nextVal = 10 * val + (val % 10);
			queue.put(nextVal);
			
			// 9 
			if ( (val % 10) != 9 ) {
				nextVal = 10 * val + (val % 10) + 1;
				queue.put(nextVal);
			}
		}
				
		log( val );

		sc.close();
	}
	

}

class Queue{
	Node firstNode;
	Node lastNode;
	
	public Queue(){
		firstNode=null;
		lastNode=null;
	}
	
	long get() {
		long retVal=0;
		if (firstNode != null) {
			retVal = firstNode.val;
			if (firstNode.nextNode != null) {
				firstNode.nextNode.prevNode = null;
				firstNode = firstNode.nextNode;
			}
			if (firstNode == null) {
				lastNode = null;
			}
		}
		else {
			retVal = -1;		// need to handle by caller
		}
		return retVal;
	}
	
	void put(long val) {
		Node newNode = new Node(val);
		if (lastNode != null) {
			newNode.prevNode = lastNode;
			lastNode.nextNode = newNode;
			if (lastNode.nextNode == null)
				firstNode = lastNode;
		}
		// must be empty
		else {
			newNode.prevNode = null;
			newNode.nextNode = null;
			firstNode = newNode;
		}
		lastNode = newNode;
	}
}

class Node{
	long  val;
	Node nextNode;
	Node prevNode;
	
	Node(long v){
		val = v;
	}
}
