import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
 
 
public class Main {
	
	public static void main(String[] args) throws IOException {
		Main m = new Main();
		//*
		m.input();
		m.solve();
		m.output();
		/*/
		m.debug();
		//*/
	}
	
	public void debug() {
	}
	
	//*
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	/*/
	InputUtil in = new InputUtil();
	//*/
	PrintWriter out = new PrintWriter(System.out);
	String s = null;
	int x,y;
	boolean ans=false;
	HashSet<State> stateQueue = new HashSet<>();
	HashSet<State> tempStateQueue = new HashSet<>();

	public void input() throws IOException {
		//*
		s = br.readLine();
		String[] tmp = br.readLine().split(" ");
		x = Integer.parseInt(tmp[0]);
		y = Integer.parseInt(tmp[1]);
		/*/
		N = in.nextInt();
		A = in.nextInt(new int[N]);
		//*/
	}
	
	public void solve() throws IOException {
		int fCount = 0;
		int tCount = 0;
		char[] sa = s.toCharArray();
		for(int i=0; i<sa.length; i++) 
			if(s.charAt(i)=='F') 
				fCount++;
			else
				tCount++;

		int renzoku = 1;
		boolean isF = false;
		stateQueue.add(new State());
		HashSet<State> swaptmp = null;
		for(int i=0; i<sa.length; i+=renzoku){
			isF = false;
			for(State state: stateQueue){
				renzoku = 1;
				if(sa[i]=='F'){
					isF = true;
					while(i+renzoku<sa.length && sa[i+renzoku]=='F'){
						renzoku++;
					}
					state.forward(renzoku);
					if(state.check(x,y,fCount-renzoku,tCount)){
						tempStateQueue.add(state);
					}
				}else{
					while(i+renzoku<sa.length && sa[i+renzoku]=='T'){
						renzoku++;
					}
					for(State nextState : state.turn(renzoku)){
						if(nextState.check(x,y,fCount,tCount-renzoku)){
							tempStateQueue.add(nextState);
						}
					}
					
				}
			}
			if(isF)
				fCount -= renzoku;
			else
				tCount -= renzoku;
			swaptmp = stateQueue;
			stateQueue = tempStateQueue;
			tempStateQueue = swaptmp;
			tempStateQueue.clear();
			swaptmp = null;
		}
		
		for(State state: stateQueue){
			if(state.x == this.x && state.y == this.y){
				ans=true;
				break;
			}
		}
	}
	
	public void output() {
		out.println(ans?"Yes":"No");
		out.flush();
	}
}

class State  {
	int x = 0;
	int y = 0;
	int dx = 1;
	int dy = 0;
	
	public State forward(int count) {
		x += dx * count;
		y += dy * count;
		return this;
	}
	
	public boolean check(int goalX, int goalY, int fCount, int tCount){
		if(Math.abs(goalX-this.x)+Math.abs(goalY-this.y) > fCount){
			return false;
		}
		if(tCount==0){
			if(goalX == this.x){
				if(this.dy>0 && goalY<this.y){
					return false;
				}else if (this.dy<0 && goalY>this.y){
					return false;
				}
			}else if(goalY == this.y){
				if(this.dx>0 && goalX<this.x){
					return false;
				}else if (this.dx<0 && goalX>this.x){
					return false;
				}
			}else{
				return false;
			}
		}
		return true;
		
	}
	
	public State turnRight(){
		if(dx==1){//dy==0
			dx=0;dy=-1;
		}else if(dy==-1){//dx==0
			dx=-1;dy=0;
		}else if(dx==-1){//dy==0
			dx=0;dy=1;
		}else{//dx==0, dy==1
			dx=1;dy=0;
		}
		return this;
	}

	public State turnLeft(){
		if(dx==1){//dy==0
			dx=0;dy=1;
		}else if(dy==-1){//dx==0
			dx=1;dy=0;
		}else if(dx==-1){//dy==0
			dx=0;dy=-1;
		}else{ //dx==0, dy==1
			dx=-1;dy=0;
		}
		return this;
	}
	
	public HashSet<State> turn(int count) {
		HashSet<State> ll = new HashSet<>();
		if(count % 2 == 1 ){
			ll.add(clone().turnLeft());
			ll.add(turnRight());
		}else{
			ll.add(clone().turnLeft().turnLeft());
			ll.add(this);
		}
		return ll;
	}
	
	public State clone() {
		State cl = new State();
		cl.x=this.x;
		cl.y=this.y;
		cl.dx=this.dx;
		cl.dy=this.dy;
		return cl;
	}
	
	@Override
	public String toString() {
		return "x="+x+",y="+y+",dx="+dx+",dy="+dy;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dx;
		result = prime * result + dy;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		State other = (State) obj;
		if (dx != other.dx)
			return false;
		if (dy != other.dy)
			return false;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
}
 
//*
class InputUtil {
	//Static Fields
	private static final int BUFSIZ = 100000;
	
	//Fields
	protected InputStream in;
	private byte[] buf = null;
	private int ptr = 0;
	private int max = -1;
	private DataInputStream dis = null;
	//Constructors
	public InputUtil() {this(System.in,BUFSIZ);}
	public InputUtil(InputStream in, int bufsiz) {
		initBuf(bufsiz);
		initIn(in);
	}
	
	//Methods
	//Initializer
	protected void initIn(InputStream in) {dis = new DataInputStream(this.in = in);}
	protected void initBuf(int bufsiz) {buf = new byte[bufsiz];}
	
	//buffer operation
	private void next() throws IOException {ptr++; readBuf();}
	private void readBuf() throws IOException {
		if(ptr >= max && dis.available()>0) {
			if(max>0) Arrays.fill(buf,0,max,(byte)0);
			max = dis.read(buf);
			ptr = 0;
		}
	}
	
	//Number Input Reader/Parser
	private boolean isNum(byte b) {return '0' <= b && b <= '9'; }
	private boolean isMinus(byte b) {return b=='-'; }
 
	private int _nextInt() throws IOException {
		int sign = 1;
		int res = 0;
		byte c;
		while (!isNum(c=buf[ptr]) && !isMinus(c)) 
			next();
		if (isMinus(buf[ptr])) {
			sign = -1;
			next();
		}
		while (isNum(c=buf[ptr])) {
			res *= 10;
			res += c - '0' ;
			next();
		}
		next();
		return sign * res;
	}
	
	public int nextInt() throws IOException {
		readBuf();
		return _nextInt();
	}
 
	public int[] nextInt(int[] result) throws IOException {
		readBuf();
		for(int i=0; i<result.length; i++) {
			result[i] = _nextInt();
		}
		return result;
	}
	
	//Close 
	public void close() throws IOException {
		if(!this.in.equals(System.in)) 
			this.in.close();
	}
}
//*/