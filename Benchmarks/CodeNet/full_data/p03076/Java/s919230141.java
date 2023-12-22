import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	static class State implements Comparable<State> {
		int time;
		State(int time){
			this.time = time;
		}
		public int compareTo(State s) {
			if((10 - (time+9)%10) > (10 - (s.time+9)%10)) {
				return 1;
			}
			return -1;
		}
	}

    public static void main(String[] args) throws Exception {
    	try(Scanner sc = new Scanner(System.in)) {

    		PriorityQueue<State> pq = new PriorityQueue<State>();
    		for(int i=0; i<5; i++) {
    			int time = sc.nextInt();
    			pq.add(new State(time));
    		}
    		int ans = 0;
    		for(int i=0; i<4; i++){
    			State next = pq.remove();
    			//System.out.println(next.time);
    			ans += (next.time + 9)/10 *10;
    		}
    		ans += pq.remove().time;
    		System.out.println(ans);
    	}
    }
}