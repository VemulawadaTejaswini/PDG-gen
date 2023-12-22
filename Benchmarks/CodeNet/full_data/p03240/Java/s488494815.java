import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static class State{
		int Cx, Cy, H;
		public State(int Cx, int Cy, int H) {
			this.Cx = Cx;
			this.Cy = Cy;
			this.H = H;
		}
	}

    public static void main(String[] args) throws Exception {
    	try(Scanner sc = new Scanner(System.in)) {

    		int N = sc.nextInt();
    		Queue<State> q = new LinkedList<State>();
    		for(int i=0; i<101; i++) {
    			for(int j=0; j<101; j++) {
    				q.add(new State(i, j, 0));
    			}
    		}
    		
    		int count = 0;
    		for(int n=0; n<N; n++) {
    			int xn = sc.nextInt();
    			int yn = sc.nextInt();
    			int hn = sc.nextInt();
    			if(hn == 0)	continue;
    			int size = q.size();
    			count++;
    			for(int i=0; i<size; i++) {
    				State state = q.remove();
    				if(count==1)
    					q.add(new State(state.Cx, state.Cy, hn+Math.abs(xn-state.Cx)+Math.abs(yn-state.Cy)));
    				else if(state.H !=0 && state.H == hn+Math.abs(xn-state.Cx)+Math.abs(yn-state.Cy))
    						q.add(new State(state.Cx, state.Cy, state.H));
    			}
    		}
    		State state = q.remove();
    		System.out.println(state.Cx+" "+state.Cy+" "+state.H);

    	}
    }
}
