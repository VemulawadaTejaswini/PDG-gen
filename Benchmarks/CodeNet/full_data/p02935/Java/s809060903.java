import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
	
	void run() {
		int n = sc.nextInt();
		PriorityQueue<Double> queue = new PriorityQueue<Double>();
		for(int i = 0; i < n ; i++) {
			queue.add(sc.nextDouble());
		}
		
		while(true) {
			double a = queue.poll();
			
			if(queue.isEmpty()) {
				System.out.println(a);
				return;
			}
			
			double b = queue.poll();
			queue.offer((a+b)/2);
			
		}
	}
}
