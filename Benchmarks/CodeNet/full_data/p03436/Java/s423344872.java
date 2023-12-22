import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayDeque;
import java.util.Arrays;


 
 
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
	String S = null;
	/*/
	InputUtil in = new InputUtil();
	//*/
	PrintWriter out = new PrintWriter(System.out);
	int H = 0;
	int W = 0;
	char[][] buf = null;
	int[][] step = null;
	int countWall = 0;
	int ans = -1;
	
	
	
	
	public void input() throws IOException {
		String[] tmpStrs = br.readLine().split(" ");
		H = Integer.parseInt(tmpStrs[0]);
		W = Integer.parseInt(tmpStrs[1]);
		buf = new char[H+2][W+2];
		step = new int[H+2][W+2];
		Arrays.fill(buf[0], '#');
		Arrays.fill(step[0], Integer.MAX_VALUE);
		for(int i=1; i<H+1; i++) {
			String tmpStr = br.readLine();
			if (tmpStr == null) {
				break;
			}
			char[] tmpAry = tmpStr.toCharArray();
			for (char c: tmpAry) {
				if (c == '#') {
					countWall ++;
				}
			}
			Arrays.fill(buf[i], '#');
			Arrays.fill(step[i], Integer.MAX_VALUE);
			System.arraycopy(tmpAry, 0, buf[i], 1, tmpAry.length);
		}
		Arrays.fill(buf[H+1], '#');
		Arrays.fill(step[H+1], Integer.MAX_VALUE);
		step[1][1]=1;

	}
//	
//	private void debugOutput() {
//		DecimalFormat df = new DecimalFormat("00");
//		for (int y=0; y<H+2; y++) {
//			System.out.println(buf[y]);
//		}
//		for (int y=0; y<H+2; y++) {
//			for (int x=0; x<W+2; x++) {
//				if (x>0) {
//					System.out.print(",");
//				}
//				if (step[y][x] < Integer.MAX_VALUE) {
//					System.out.print(df.format(step[y][x]));
//				} else { 
//					System.out.print("##");
//				}
//			}
//			System.out.println("");
//		}
//	}
	
	public void solve() throws IOException {
		ArrayDeque<Point> q = new ArrayDeque<Point>();
		Point[] dirs = new Point[4];
		dirs[0] = new Point(1,0);
		dirs[1] = new Point(0,1);
		dirs[2] = new Point(-1,0);
		dirs[3] = new Point(0,-1);
		q.add(new Point(1,1));
		while (!q.isEmpty()) {
			Point p = q.poll();
			for (int dir=0; dir<dirs.length; dir++) {
				Point d = dirs[dir];
				Point np = p.move(d);
				if (buf[np.y][np.x]=='.' && step[np.y][np.x] > step[p.y][p.x] + 1) {
					step[np.y][np.x] = step[p.y][p.x] + 1;
					q.add(np);
				}
//				System.out.println("-----------p=("+p.y+","+p.x+"), d=("+d.y+","+d.x+"), np="+np.y+","+np.x+"");
//				debugOutput();
			}
		}
		ans = (H*W) - countWall - step[H][W];
	}

	
	public void output() {
		out.println(ans);
		out.flush();
	}
}

class Point {
	int y;
	int x;
	public Point(int y, int x) {
		this.x=x;
		this.y=y;
	}
	
	public Point move(Point d) {
		Point p = new Point(y, x);
		p.x += d.x;
		p.y += d.y;
		return p;
	}
	
}

/*
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
 
	private long _nextLong() throws IOException {
		int sign = 1;
		long res = 0;
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
	
	public long nextLong() throws IOException {
		readBuf();
		return _nextLong();
	}
 
	public long[] nextLong(long[] result) throws IOException {
		readBuf();
		for(int i=0; i<result.length; i++) {
			result[i] = _nextLong();
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
