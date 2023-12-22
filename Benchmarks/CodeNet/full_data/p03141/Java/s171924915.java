import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	static class State implements Comparable<State>{
		Long A, B;
		State(Long A, Long B){
			this.A = A;
			this.B = B;
		}
		public int compareTo(State s){
			if(this.A + this.B < s.A + s.B ){
				return 1;
			}
			else if(this.A + this.B == s.A + s.B ) {
				return  0;
			}
			return -1;
		}

	}
    public static void main(String[] args) throws Exception {
    	Scanner sc = new Scanner(System.in);

    	int N = sc.nextInt();
    	PriorityQueue<State> pq = new PriorityQueue<State>();
    	for(int i = 0; i < N; i++){
    		Long a = sc.nextLong();
    		Long b = sc.nextLong();
    		pq.add(new State(a, b));
    	}
    	long Acount = 0, Bcount = 0;
    	for(int i = 0; i < N; i++){
    		State s = pq.remove();
    		if(i%2 == 0){
    			Acount += s.A;
    		}
    		else{
    			Bcount += s.B;
    		}
    	}
    	System.out.println(Acount - Bcount);
    }
}