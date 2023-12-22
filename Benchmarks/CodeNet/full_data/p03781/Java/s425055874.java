import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		
		Queue<PosT> queue = new LinkedList<>();
		queue.add(new PosT(0,0));
		while(queue.size() > 0){
			PosT cur = queue.remove();
			if(cur.pos == x){
				System.out.println(cur.time);
				return;
			}
			queue.add(new PosT(cur.pos+cur.time+1,cur.time+1));
			queue.add(new PosT(cur.pos-cur.time-1,cur.time+1));
			queue.add(new PosT(cur.pos,cur.time+1));
		}
	}
}

class PosT{
	public int pos;
	public int time;
	
	public PosT(int _pos, int _time){
		pos = _pos;
		time = _time;
	}
}